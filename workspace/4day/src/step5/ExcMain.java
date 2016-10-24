package step5;

import java.util.Scanner;

public class ExcMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Overr o = null;
		System.out.println("종족을 선택하시오");
		System.out.println("1.피카츄\n2.이상해\n3.꼬부기");
		int x = sc.nextInt();
		System.out.println("이름을 입력하시오.");
		String name = sc.next();

		// 업캐스팅
		// 피카츄 변수 꼬북이 변수 이상해 변수를 각각 만들면
		// 메뉴 while문을 3개를 각각 만들어 주어야 한다.
		//
		// 업캐스팅을 사용하면 3개가 모두 Overr Type이지만 메서드를 호출하면
		// 재정의된 메서드가 호출된다

		if (x == 1)
			o = new Picachu(name);
		else if (x == 2)
			o = new Lee(name);
		else if (x == 3)
			o = new Gobook(name);
		boolean flag = true;

		while (flag) {
			System.out.println("메뉴");
			System.out.println("1.밥먹기\n2.잠자기\n3.운동하기\n4.공격\n5.종료");
			x = sc.nextInt();
			switch (x) {
			case 1:
				o.eat();
				o.print();
				break;
			case 2:
				o.sleep();
				o.print();
				break;
			case 3:
				o.exercise();
				o.print();
				if (o.energy <= 0) {
					System.out.println("게임종료");
					flag = false;
				}
				break;
			case 4:
				o.aging();
				o.print();
				if (o.energy <= 0) {
					System.out.println("게임종료");
				}
				break;

			case 5:
				System.out.println("게임종료");
				flag = false;

			}
		}
	}

}
