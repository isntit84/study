
public class IfElseIf {

	public static void main(String[] args) {
		int grade = 85; // 초기값지정
		if (grade >= 90)
			System.out.println("성적은A 입니다.");
		else if (grade >= 80)
			System.out.println("성적은B 입니다.");
		else if (grade >= 70)
			System.out.println("성적은C 입니다.");
		else if (grade >= 60)
			System.out.println("성적은D 입니다.");
		else
			System.out.println("성적은F 입니다.");
	}

}
