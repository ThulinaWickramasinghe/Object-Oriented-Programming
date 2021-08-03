
class Test {

	public static void main(String[] args) {
		
		/*
		 
		//Ex 1
		  
		Student st1 = new Student();
		st1.name = "Thulina";
		st1.ditno = "IT1000000";
		st1.address = "Edurapotha, Dewalegama";
		
		Student st2 = new Student();
		st2.name = "Wickramasnghe";
		st2.ditno = "IT2000000";
		st2.address = "Lake Round, Kurunegala";
		
		System.out.println("st1: " + st1.name + " " + st1.ditno + " " + st1.address);
		System.out.println("st2: " + st2.name + " " + st2.ditno + " " + st2.address);
		
		*/
		
		//Ex 2
		Student st1 = new Student("Thulina" , "IT1000000" , "Edurapotha,Dewalegama");
		Student st2 = new Student("Wickramasinghe" , "IT2000000" , "Lake Round, Kurunegala");
		
		//Ex 3 c)
		st1.setName("Sherlock");
		st1.setAddress("221B,Baker Street");
		st1.setDit("CS00001");
		
		System.out.println("New Details: " + st1.getName() + " " + st1.getDitno() + " " + st1.getAddress());
		
		//Ex4 c)
		System.out.print(st1.getDetails());
		
	}

}

