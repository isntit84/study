package step5;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc c = new Calc();
		int x, y;
		boolean flag=true;
		
		int i;		


		
		while(flag){
			System.out.println("1.���ϱ� ");
			System.out.println("2.���� ");
			System.out.println("3.���ϱ� ");
			System.out.println("4.������ ");
			System.out.println("5.���� ");
			i= sc.nextInt();
			
			switch(i){
			case 1:
				System.out.println("���ϱ��� ���� �ΰ��� �Է��Ͻÿ� : ");
				x=sc.nextInt();
				y=sc.nextInt();
				c.add(x,y);
								break;
				
			case 2:
				System.out.println("������ ���� �ΰ��� �Է��Ͻÿ� : ");
				x=sc.nextInt();
				y=sc.nextInt();
				c.sub(x,y);
								break;
				
			case 3:
				System.out.println("���ϱ��� ���� �ΰ��� �Է��Ͻÿ� : ");
				x=sc.nextInt();
				y=sc.nextInt();
				c.mul(x,y);
								break;
				
			case 4:
				System.out.println("�������� ���� �ΰ��� �Է��Ͻÿ� : ");
				x=sc.nextInt();
				y=sc.nextInt();
				c.div(x,y);
								break;
				
			case 5:
				flag=false;
				break;
			}
			}
	}
}