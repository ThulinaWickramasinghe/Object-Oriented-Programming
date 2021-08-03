package Inheritance;

//Ex5
class Person {
	
	private String name;
	private String address;
	
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	public void showDetails() {
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
}
