package step9;

/*instance variable: model, color : String
Constructor : 매개변수 두가지
set/get*/
public class Car {
	private String model;
	private String color;

	/*
	 * public void getCar(){ System.out.println(model);
	 * System.out.println(color); }
	 */
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
