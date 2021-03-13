package model;

public class Student {
	int studentId;
	String studentName;
	String student;
	String numberPhone;
	String address;
	String Batch;
	double Mark1;
	double Mark2;
	
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String student, String numberPhone, String address, String batch,
			double mark1, double mark2) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.student = student;
		this.numberPhone = numberPhone;
		this.address = address;
		Batch = batch;
		Mark1 = mark1;
		Mark2 = mark2;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
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
	public String getBatch() {
		return Batch;
	}
	public void setBatch(String batch) {
		Batch = batch;
	}
	public double getMark1() {
		return Mark1;
	}
	public void setMark1(double mark1) {
		Mark1 = mark1;
	}
	public double getMark2() {
		return Mark2;
	}
	public void setMark2(double mark2) {
		Mark2 = mark2;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", student=" + student
				+ ", numberPhone=" + numberPhone + ", address=" + address + ", Batch=" + Batch + ", Mark1=" + Mark1
				+ ", Mark2=" + Mark2 + "]";
	}
	public double DiemTB() {
		return (Mark1 + Mark2)/2;
	}

}
