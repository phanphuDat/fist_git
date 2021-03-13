package model;

public class Teacher {
	int TeacheerId;
	String teacherName;
	String numberPhone;
	String address;
	double salary;
	int numberWorkDay;
	
	public Teacher() {
		super();
	}
	public Teacher(int teacheerId, String teacherName, String numberPhone, String address, double salary,
			int numberWorkDay) {
		super();
		TeacheerId = teacheerId;
		this.teacherName = teacherName;
		this.numberPhone = numberPhone;
		this.address = address;
		this.salary = salary;
		this.numberWorkDay = numberWorkDay;
	}
	public int getTeacheerId() {
		return TeacheerId;
	}
	public void setTeacheerId(int teacheerId) {
		TeacheerId = teacheerId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = numberWorkDay;
	}
	public int getNumberWorkDay() {
		return numberWorkDay;
	}
	public void setNumberWorkDay(int numberWorkDay) {
		this.numberWorkDay = numberWorkDay;
	}
	@Override
	public String toString() {
		return "Teacher [TeacheerId=" + TeacheerId + ", teacherName=" + teacherName + ", numberPhone=" + numberPhone
				+ ", address=" + address + ", salary=" + salary + ", numberWorkDay=" + numberWorkDay + "]";
	}
	public double Luong(){
		return numberWorkDay * 800000;
		
	}
	

}
