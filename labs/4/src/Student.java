
public class Student {
	private static int max = 100;
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	
	public Student(String name, String degree, String mobile) {
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		studentID = ++max;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDegree() {
		return this.degree;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println();
		System.out.println("Student ID : " + this.studentID);
		System.out.println("Name       : " + this.name);
		System.out.println("Degree     : " + this.degree);
		System.out.println("Mobile     : " + this.mobile);
		System.out.println();
	}
	
	public static int getNextStudentID() {
		return max+1;
	}
}
