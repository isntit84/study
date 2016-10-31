package vo;

public class PersonVO {
	private String id;
	private String name;
	private String address;
	private int money;

	public PersonVO(String id, String name, String address, int money) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "PersonVO [id=" + id + ", name=" + name + ", address=" + address + ", money=" + money + "]";
	}
}
