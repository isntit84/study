package step7;

public class MyDate {
	private int day = 3;
	private int month = 3;
	private int year = 1999;

	public MyDate() {
	}// 기본생성자

	
	//인자값 있는 생성자
	//생성자 오버로딩
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
