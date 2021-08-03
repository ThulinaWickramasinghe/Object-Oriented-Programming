package Inheritance;

//Ex5
class InheritanceDemo {

	public static void main(String[] args) {
		
		//Ex5
		Person p1 = new Person("Sherlock" , "Edurapotha,Dewalegama");
		p1.showDetails();
		
		
		//Ex6
		Student s1 = new Student("Thulina" , "Edurapotha,Dewalegama" , "IT100001");
		s1.showDetails();
		
		//Ex7
		PartTimeStudent ps1 = new PartTimeStudent("Nimal", "123A,Colombo Rd.,Galle", "it102232", 5);
		ps1.showDetails();

	}

}
