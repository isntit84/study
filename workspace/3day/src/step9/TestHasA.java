package step9;

public class TestHasA {

	public static void main(String[] args) {
Person p=new Person();
p.setName("æ∆¿Ã¿Ø")
p.setCar(new Car("k5","red"));
System.out.println(p.getName());
System.out.println(p.getCar());
System.out.println(p.getCar().getModel());
System.out.println(p.getCar().getColor());

p.getCar().setModel("sm5");

p.getCar().setColor()("black");
System.out.println(p.getCar().getModel());
System.out.println(p.getCar().getColor());


	}

}
