/**
 * 
 */
package animals;

/**
 * @author it20654580
 *
 */
class Dog extends Pet {

	/**
	 * @param n
	 * @param o
	 * @param a
	 */
	private int noOfMasters;
	
	public Dog(String n, String o, int a , int m) {
		super(n, o, a);
		this.noOfMasters = m;
	}

	/**
	 * @param n
	 * @param o
	 */
	public Dog(String n, String o) {
		super(n, o);
		this.noOfMasters = 1;
		// TODO Auto-generated constructor stub
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I a dog. I have " + this.noOfMasters  + " masters at home.");
	}

}
