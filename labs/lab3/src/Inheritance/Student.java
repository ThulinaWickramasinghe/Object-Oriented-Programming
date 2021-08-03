/**
 * 
 */
package Inheritance;

/**
 * @author it20654580
 *
 */
class Student extends Person {

	/**
	 * @param name
	 * @param address
	 */
	private String studentid;
	
	public Student(String name, String address , String studentid) {
		super(name, address);
		this.studentid = studentid;
	}
	
	public String getStuID() {
		return this.studentid;
	}
	
	public void setStuID(String studentid) {
		this.studentid = studentid;
	}

}
