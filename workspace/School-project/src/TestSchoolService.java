
public class TestSchoolService {

	public static void main(String[] args) {
		// SchoolService2 service=new SchoolService2(); //���� �׽�ƮŬ���� �ۼ�
		SchoolService service = new SchoolService();
		// tel, name ,address, stuId
		Student s = new Student("011", "ũ����Ż", "�Ǳ�", "12");
		service.addPerson(s);// �Ѹ��� �߰�,�����°� ����
		// tel, name, address,subject
		Teacher t = new Teacher("017", "Ȳ����", "�ͻ�", "����");
		service.addPerson(t);// �Ѹ� ��
		// tel, name, address,dept
		Employee e = new Employee("015", "�ÿ���", "����", "�����");
		service.addPerson(e);
		service.printAll();
		Person per = service.findPerson("017");
		if (per != null)
			System.out.println(per);// Ȳ���� ������ ��� ���
		else
			System.out.println("ã�� ������ ����!");
		// ��ȣ ��ġ�ϸ� ����
		service.deletePerson("017");
		service.printAll();
		// ��ȣ�� �ش��ϴ� ����Ʈ�� ��Ҹ� ������Ʈ
		service.updatePerson("019", new Student("010", "����", "����", "13"));
		service.printAll();

	}

}
