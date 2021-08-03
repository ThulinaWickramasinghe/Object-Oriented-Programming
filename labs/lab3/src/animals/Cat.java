package animals;

class Cat extends Pet {

	private int livesLeft;
	
	public Cat(String n, String o, int a, int l) {
		super(n, o, a);
		this.livesLeft = l;
	}
	
	public Cat(String n, String o) {
		super(n,o,0);
		this.livesLeft = 7;
	}
	
	//Ex11
	public void showDetails() {
		super.showDetails();
		System.out.println("I a cat. " + this.livesLeft + " lives remain for me.");
	}

}
