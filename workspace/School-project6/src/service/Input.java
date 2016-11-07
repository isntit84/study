package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class Input {
	private String fileName = "C:\\java-kosta\\iotest\\school.obj";

	public void startMenu() throws IOException, DuplicateTelException, PersonNotFoundException, ClassNotFoundException {
		SchoolService service = new SchoolService();
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("*******학사관리프로그램을 시작합니다******");

		service.loadData(fileName);

		while (true) {
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String str = br.readLine();
			if (str.equals("1")) {
				String tel, name, address = null;
				String type = "";
				Person p = null;
				while (true) {
					System.out.println("입력할 구성원의 종류를 선택하세요 1.학생  2.선생님 3.직원");
					type = br.readLine();
					if (type.equals("1") || type.equals("2") || type.equals("3")) {
						break;
					} else {
						System.out.println("잘못된 입력값입니다!");
					}
				}
				System.out.println("1. 전화번호를 입력하세요!");
				tel = br.readLine();
				System.out.println("2. 이름을 입력하세요!");
				name = br.readLine();
				System.out.println("3. 주소를 입력하세요!");
				address = br.readLine();
				if (type.equals("1")) {
					System.out.println("4. 학번을 입력하세요!!");
					String str4 = br.readLine();
					Student stu = new Student(tel, name, address, str4);
					p = stu;
				} else if (type.equals("2")) {
					System.out.println("4. 과목을 입력하세요!");
					String str4 = br.readLine();
					Teacher tc = new Teacher(tel, name, address, str4);
					p = tc;
				} else if (type.equals("3")) {
					System.out.println("3. 부서를을 입력하세요!");
					String str4 = br.readLine();
					Employee emp = new Employee(tel, name, address, str4);
					p = emp;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				try {
					service.addPerson(p);
					System.out.println(p + " add ok");
				} catch (DuplicateTelException de) {
					System.out.println(de.getMessage());
				}

			}
			// 삭제
			else if (str.equals("2")) {
				System.out.println("1. 전화번호를 입력하세요!");
				String tel2 = br.readLine();
				try {
					service.deletePerson(tel2);
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}
			// 검색
			else if (str.equals("3")) {
				System.out.println("1. 전화번호를 입력하세요!");
				String tel1 = br.readLine();
				try {
					System.out.println(service.findPerson(tel1));
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}
			// 전체 회원보기
			else if (str.equals("4")) {
				service.printAll();
			}
			// 종료
			else if (str.equals("5")) {
				System.out.println("*******학사관리프로그램을 종료합니다******");
				service.saveData(fileName);
				break;
			} else {
				System.out.println("입력된값이 잘못되었습니다.");
			}
		}
	}
}
