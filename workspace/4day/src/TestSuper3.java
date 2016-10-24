//x


class Animal{
	int age =1 ;
	private String card = "카드";
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getCard(){
		return card;
	}
	public void setCard(String card){
		this.card=card;
			}
	}
class Person extends Animal {
	public void info(){
		System.out.println("부모 변수에 접근 테스트 :"+super.age);
		System.out.println(super.getCard());
		}
public class TestSuper3 {

	public static void main(String[] args) {
		Person p = new Person();
		p.info();
	}}}