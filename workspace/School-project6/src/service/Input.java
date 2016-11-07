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
		System.out.println("*******�л�������α׷��� �����մϴ�******");

		service.loadData(fileName);

		while (true) {
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
			String str = br.readLine();
			if (str.equals("1")) {
				String tel, name, address = null;
				String type = "";
				Person p = null;
				while (true) {
					System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л�  2.������ 3.����");
					type = br.readLine();
					if (type.equals("1") || type.equals("2") || type.equals("3")) {
						break;
					} else {
						System.out.println("�߸��� �Է°��Դϴ�!");
					}
				}
				System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���!");
				tel = br.readLine();
				System.out.println("2. �̸��� �Է��ϼ���!");
				name = br.readLine();
				System.out.println("3. �ּҸ� �Է��ϼ���!");
				address = br.readLine();
				if (type.equals("1")) {
					System.out.println("4. �й��� �Է��ϼ���!!");
					String str4 = br.readLine();
					Student stu = new Student(tel, name, address, str4);
					p = stu;
				} else if (type.equals("2")) {
					System.out.println("4. ������ �Է��ϼ���!");
					String str4 = br.readLine();
					Teacher tc = new Teacher(tel, name, address, str4);
					p = tc;
				} else if (type.equals("3")) {
					System.out.println("3. �μ����� �Է��ϼ���!");
					String str4 = br.readLine();
					Employee emp = new Employee(tel, name, address, str4);
					p = emp;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				try {
					service.addPerson(p);
					System.out.println(p + " add ok");
				} catch (DuplicateTelException de) {
					System.out.println(de.getMessage());
				}

			}
			// ����
			else if (str.equals("2")) {
				System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���!");
				String tel2 = br.readLine();
				try {
					service.deletePerson(tel2);
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}
			// �˻�
			else if (str.equals("3")) {
				System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���!");
				String tel1 = br.readLine();
				try {
					System.out.println(service.findPerson(tel1));
				} catch (PersonNotFoundException pe) {
					System.out.println(pe.getMessage());
				}
			}
			// ��ü ȸ������
			else if (str.equals("4")) {
				service.printAll();
			}
			// ����
			else if (str.equals("5")) {
				System.out.println("*******�л�������α׷��� �����մϴ�******");
				service.saveData(fileName);
				break;
			} else {
				System.out.println("�ԷµȰ��� �߸��Ǿ����ϴ�.");
			}
		}
	}
}
