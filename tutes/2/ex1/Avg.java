import java.util.Scanner;

class Avg{
    public static void main(String args[]){
        float [] marks = new float[3];

        Scanner ob = new Scanner(System.in);

        for(int i=0; i < 3; i++){
            marks[i] = ob.nextFloat();
        }

        float avg = 0;

        for(int i=0; i < 3; i++){
            avg += marks[i];
        }
        
        avg/=3;

        System.out.println("Average is " +  avg);

    }
}