package step10;

public class TestHasA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engineer e=new Engineer("����", new Notebook("��",100));
		System.out.println(e.getName());
		System.out.println(e.getNotebook().getModel());
		System.out.println(e.getNotebook().getPrice());
		
		e.getNotebook().setPrice(200);;
		System.out.println(e.getNotebook().getPrice());
		
	}

}
