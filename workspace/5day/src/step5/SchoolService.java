package step5;

public class SchoolService {
	private int index;
	private MemberVO p[] = new MemberVO[10];

	// 배열의 추가된 요소가 몇개인지 저장하는 변수
	// 학교 구성원을 추가하는 매서드 개체가 넘어오면 배열에 추가하고 index++한다.
	public void addPerson(MemberVO p) {
		this.p[index] = p;
		index++;
	}
	// p배열의 요소 모두를 출력 toString()을 오버라이딩 했으므로 배열 요소(ex)p[0]만 출력하면된다.
	// index를 이용해 배열 모두가 아니라 추가된 요소까지만 출력해야한다.

	public void printAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(p[i]);
		}
	}

	// 전화번호로 학교 구성원을검색하는 매서드 넘어온 번호와 배역요소의 전화번호가 일치하면
	// 해당 배열 요소를 리턴한다. 만약 일치되는 배열 요소가 없을 경우 null을 반환한다.

	public MemberVO findPerson(String name) {
		MemberVO per = null;
		for (int i = 0; i < index; i++) {
			if (p[i].getName().equals(name)) {// 전화번호가 같은지 비교
				per = p[i];//
			}
		}
		return per;
	}
}