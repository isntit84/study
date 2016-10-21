package step7;

import java.util.Scanner;

public class addr {
	String name;
	String Tel;
	String addres;
	
	boolean search(String name){
		if(this.name.equals(name))
			return true;
		else
			return false;
	}

	void Input(Scanner sc) {
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("전화번호를 입력하세요 : ");
		Tel = sc.next();
		System.out.println("주소를 입력하세요 : ");
		addres = sc.next();
	}

	void print() {
		System.out.println("이름은 : " + name);
		System.out.println("전화번호는 : " + Tel);
		System.out.println("주소는 : " + addres);
//		System.out.println("이름 : "+name+"\t전화번호 : "+Tel+"\t주소 : "+addres);
	}
}

// 변수 선언: 이름 전번 주소 ->검색대입 -> 입력값-> 출력값
