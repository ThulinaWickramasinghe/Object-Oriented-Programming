package ex2;

class Feet {
	private int feet;
	private int inches;
	
	public Feet() {
		feet = 0;
		inches = 0;
	}
	
	public Feet(int feet, int inches) {
		if(inches >= 12) {
			System.out.println("Invalid input!!! Inches must be less than 12!");
		}else {
			this.feet = feet;
			this.inches = inches; 
		}
	}
	
	public Feet(Feet len) {
		this.feet = len.getFeet();
		this.inches = len.getInches();
	}
	
	public int getFeet() {
		return this.feet;
	}

	public int getInches() {
		return this.inches;
	}
	
	public void add(Feet f1, Feet f2) {
		this.feet = f1.getFeet()+f2.getFeet();
		this.inches = f1.getInches()+f2.getInches();
		
		if(this.inches >= 12) {
			this.inches-=12;
			feet++;
		}
	}
	
	/*
	public static Feet add(Feet f1, Feet f2) {
		
	}
	
	We can't have an add() method like this because it accepts the same arguments as the one above
	*/
	
	//Ex2.01.g)
	public static Feet add(Feet f1, Feet f2, Feet f3) {
		int inches4,feet4;
		inches4 = f1.getInches() + f2.getInches() + f3.getInches();
		feet4 = f1.getFeet() + f2.getFeet() + f3.getFeet() + inches4/12;
		inches4 %= 12;
		Feet f4 = new Feet(feet4, inches4);
		return f4;
	}
	
	
	//Ex2.01.d) Overloaded add method
	public void add(Feet f1) {
		this.feet += f1.getFeet();
		this.inches+=f1.getInches();
		
		if(this.inches >= 12) {
			this.inches-=12;
			feet++;
		}
	}
	
	public void print() {
		System.out.print(this.feet + "' " + this.inches + "''");
	}
	
	//Ex2.01.b) overloaded print function
	public void print(String msg) {
		System.out.print(msg + this.feet + "' " + this.inches + "''");
	}
	
	public static void print(Feet f) {
		System.out.println(f.getFeet() + "' " + f.getInches() + " ''");
	}
	
	//println() versions of above print functions
	public void println() {
		System.out.println(this.feet + "' " + this.inches + "''");
	}
	
	//Ex2.01.b) overloaded print function
	public void println(String msg) {
		System.out.print(msg + this.feet + "' " + this.inches + "''");
	}
	
	public static void println(Feet f) {
		System.out.println(f.getFeet() + "' " + f.getInches() + " ''");
	}
}
