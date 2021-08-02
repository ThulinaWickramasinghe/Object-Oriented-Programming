package ex2;

class Test {

	public static void main(String[] args) {
		//Ex2.01.a)Testing the feet class
		Feet height1 = new Feet(5,7);
		Feet height2 = new Feet(6,6);
		
		Feet summed = new Feet();
		summed.add(height1,height2);
		
		
		height1.print();
		System.out.print(" + ");
		height2.print();
		System.out.print(" = ");
		summed.print();
		
	}

}
