package step5;

public class Account {
	private int balance;//�ܾ�
	
	public int getBalance(){
		return balance;
	}
	public void deposit(int money){
		if(money >0){
			balance+=money;//balance=balance+money;
		}else{
			System.out.println("0�� �����̹Ƿ� �Ա��� �� �����ϴ�.");
			
		}
	}

}
