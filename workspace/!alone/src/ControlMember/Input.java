package ControlMember;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int i=0;
		String name[] = new String[5]; 
		boolean a= true;
		
		// �߰� ���� �˻� ��üȸ������ ����
		
		while(a){
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.�˻�");
			System.out.println("4.��üȸ������");
			System.out.println("5.����");
			number = sc.nextInt();
			
			switch (number){
			case 1:
			for( i =0; i< name.length; i++){
				System.out.println("1.�̸��Է�:");
				name[i] = sc.next();
				System.out.println("2.��ȭ��ȣ:");
				name[i] = sc.next();
				System.out.println("3.�ּ� :");
				name[i] = sc.next();
			}
			break;
			
			case 2:
				for (int i = 0; i < name.length; i++) {
					name = sc.nextInt();
					 name[i]==name[]

					for (int k = 0; k < i; k++) {

						if (name[k] == number) {
							k = -1;
						}
					}
				}
				break;

					
				}
			}
			break;
				
			case 3:
			
				
						
			break;
			
			case 4:
				for( i =0; i< name.length; i++){
					System.out.println(name[i]);
				}
				break;
				
			case 5:
			
				a= false
	}
}
			