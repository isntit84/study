package step4;

public class DaoImpl implements Dao {
	private int index;
	private MemberVO p[] = new MemberVO[10];

	@Override
	public void connect() {
		System.out.println("일반회원이 접속");

	}

	@Override
	public void addPerson(MemberVO p) {
		this.p[index] = p;
		index++;
	}

	@Override
	public void printAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(p[i]);
		}
	}

	@Override
	public MemberVO findPerson(String name) {
		MemberVO per = null;
		for (int i = 0; i < index; i++) {
			if (p[i].getName().equals(name)) {
				per = p[i];
			}
		}
		return per;
	}
}