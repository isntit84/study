package step1;

public class TestPerson {

	public static void main(String[] args) {

	Person p= new Person();
	
	p.setName("아이유"); //"문자열은 String
	System.out.println(p.getName());
	p.setMoney(1000);//1000 정수형은 int
	System.out.println(p.getMoney());
	}

}
