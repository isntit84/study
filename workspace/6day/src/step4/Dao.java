package step4;

public interface Dao {

	void connect();
	
	void addPerson(MemberVO p);
	
	void printAll();
	
	MemberVO findPerson(String name);
	
	//추상클래스에서 인터페이스가 필요한 이유 다중상속
}
