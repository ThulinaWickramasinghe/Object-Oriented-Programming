import java.util.Scanner;

public class Ex7{
	public static void main(String [] args){
		Scanner ob = new Scanner(System.in);
		int num1 = ob.nextInt();
		int num2 = ob.nextInt();
		int sum = num1+num2;
		
		double average = sum/2.0;

		System.out.println(sum);
		System.out.println(average);	
	}
}