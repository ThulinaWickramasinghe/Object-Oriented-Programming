import java.util.Scanner;

class Cube{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        double length,width,height;
        System.out.println("Enter length:");
        length = ob.nextDouble();
        System.out.println("Enter width:");
        width = ob.nextDouble();
        System.out.println("Enter height:");
        height = ob.nextDouble();

        System.out.println("Volume = " + length*width*height);

    }
}