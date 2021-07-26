import java.util.Scanner;

public class Stars{

	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = ob.nextInt();
		
		
		for(int k = 1 ; k <= num; k++){//count rows
			for(int l = 1; l <= num-k; l++){
				System.out.print("  ");
			}

			for(int l = 1; l <= k; l++){
				System.out.print("  * ");
			}
			
			System.out.println(); 
			
		}

		int i = 0;

		while(i < num){
			int j = 0;
			while(j < num){
				System.out.print("  * ");
				j++;
			}

			i++;
			System.out.println();
		}
	}

}