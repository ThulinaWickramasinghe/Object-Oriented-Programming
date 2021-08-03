/**
 * 
 */
package Inheritance;

/**
 * @author it20654580
 *
 */
class PartTimeStudent extends Student {

	/**
	 * @param name
	 * @param address
	 * @param studentid
	 */
	private int noOfWorkingHours;
	
	public PartTimeStudent(String name, String address, String studentid, int noOfWorkingHours) {
		super(name, address, studentid);
		this.noOfWorkingHours = noOfWorkingHours;
	}
	
	public void setWorkHours(int noOfWorkinghours) {
		this.noOfWorkingHours = noOfWorkinghours;
	}
	
	public int getWorkHours() {
		return this.noOfWorkingHours;
	}

}
