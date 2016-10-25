package step1;

public class TestPoly5 {

	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.enter(new Tiger());
		service.enter(new Monkey());
		service.enter(new Person());

	}

}
