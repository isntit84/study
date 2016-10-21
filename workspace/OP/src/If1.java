
public class If1 {

	public static void main(String[] args) {
		int i = 5;
		if (i > 0 && i < 10) {
			System.out.println("i는 0보다 크고 10보다 작다");
		}
		/*
		 * if (i == 6) { System.out.println("i는 6이다"); }
		 */

		else {
			System.out.println("i는 0보다 작거나 10보다 크다.");
		}

	}

}

/*
int a=5, b=10;
if (a>b){
	System.out.println("a="+a+"이 더크다.");
}
else
{
	System.out.println("b="+b+"이 더크다.");
}*/