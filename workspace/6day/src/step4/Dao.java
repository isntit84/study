package step4;

public interface Dao {

	void connect();
	
	void addPerson(MemberVO p);
	
	void printAll();
	
	MemberVO findPerson(String name);
	
	//�߻�Ŭ�������� �������̽��� �ʿ��� ���� ���߻��
}
