
class Student {
	
	/*
	 //For ex1
	 
	String name;
	String ditno;
	String address;
	 */

	private String name;
	private String ditno;
	private String address;
	

	
	Student(String name, String ditno, String address){
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}
	
	
	// Ex3
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDitno() {
		return ditno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDit(String ditno) {
		this.ditno = ditno;
	}
	
	public String getDetails() {
		return "I am a Student.\nMy name is " + this.getName() + ".\nI am from " + this.getAddress() + ".\nMy dit no is " + this.getDitno() + "\n" ;
	}

}