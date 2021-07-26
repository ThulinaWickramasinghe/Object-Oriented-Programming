import java.io.*;

class Console1{
    public static void main(String[] args){
        Console c1 = System.console();
        if(c1 == null){
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }

        double length,width,height;
        System.out.println("Enter length:");
        length = Double.parseDouble(c1.readLine());
        System.out.println("Enter width:");
        width = Double.parseDouble(c1.readLine());
        System.out.println("Enter height:");
        height = Double.parseDouble(c1.readLine());

        System.out.println("Volume = " + length*width*height);
    }
}