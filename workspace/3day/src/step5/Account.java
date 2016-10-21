package step5;

public class Account {
	private int balance;//잔액
	
	public int getBalance(){
		return balance;
	}
	public void deposit(int money){
		if(money >0){
			balance+=money;//balance=balance+money;
		}else{
			System.out.println("0원 이하이므로 입급할 수 없습니다.");
			
		}
	}

}
