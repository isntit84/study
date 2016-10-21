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
			System.out.println("1.더하기 ");
			System.out.println("2.빼기 ");
			System.out.println("3.곱하기 ");
			System.out.println("4.나누기 ");
			System.out.println("5.종료 ");
			i= sc.nextInt();
			
			switch(i){
			case 1:
				System.out.println("더하기할 숫자 두개를 입력하시오 : ");
				x=sc.nextInt();
				y=sc.nextInt();
				c.add(x,y);
								break;
				
			case 2:
				System.out.println("빼기할 숫자 두개를 입력하시오 : ");
				x=sc.nextInt();
				y=sc.nextInt();
				c.sub(x,y);
								break;
				
			case 3:
				System.out.println("곱하기할 숫자 두개를 입력하시오 : ");
				x=sc.nextInt();
				y=sc.nextInt();
				c.mul(x,y);
								break;
				
			case 4:
				System.out.println("나누기할 숫자 두개를 입력하시오 : ");
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