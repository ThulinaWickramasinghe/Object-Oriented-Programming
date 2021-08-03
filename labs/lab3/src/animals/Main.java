package animals;

class Main {

	public static void main(String[] args) {
		Pet p = new Pet("Lissie" , "Smith" , 3);
		p.showDetails();
		Cat c = new Cat("Kyan" , "Silva" , 4, 4);
		c.showDetails();
		
		
		//Ex9
		Pet p2 = new Pet("Birdie" , "Jane");
		p2.showDetails();
		Cat c2 = new Cat("Garfield" , "John");
		c2.showDetails();
		
		//Ex10
		Dog d1 = new Dog("Doggy" , "Asanga");
		d1.showDetails();
		Dog d2 = new Dog("Lucky" , "Damith" , 2 , 3);
		d2.showDetails();
		
		//Ex11
		Pet p3 = c;
		p3.showDetails();
	}

}
