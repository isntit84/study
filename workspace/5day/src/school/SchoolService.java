package school;

public class SchoolService {

	private int index;
	private MemberVO p[] = new MemberVO[10];

	public void addPerson(MemberVO p) {// MemberVO cannot be resolved to a type
		this.p[index] = p;
		index++;
	}

	public void printAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(p[i]);
		}
	}

	public MemberVO findPerson(String name) {
		MemberVO per = null;
		for (int i = 0; i < index; i++) {
			if (p[i].getName().equals(name)) {// 이름이 같은지 비교
				per = p[i];//
			}
		}
		return per;
	}

}