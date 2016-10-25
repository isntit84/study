package step4;

public abstract class Overr {
	public String race;
	public String name;
	public int age;
	public int power;
	public int energy;
	public int cnt;

	public Overr() {
		System.out.println("Overr Å¬·¡½º");
	}

	public abstract void eat();

	public abstract void sleep();

	public abstract void exercise();

	public abstract void playwith();

	public abstract void aging();

	public abstract void attack();

	public void print() {
		System.out.println("age : " + age);
		System.out.println("power : " + power);
		System.out.println("energy : " + energy);
	}
}