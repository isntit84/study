
public class Switch2 {

	public static void main(String[] args) {
		int a = 1, b = 2, c;
		switch (a + b) {
		case 1:
			c = 1;
			break;
		case 3:
			c = 3;
			break;
		case 4:
			c = 4;
			break;
		case 5:
			c = 5;
			break;
		default:
			c = 999;
		}
		System.out.println("c=" + c);
	}

}
