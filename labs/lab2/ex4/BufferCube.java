import java.io.*;
//import java.io.InputStreamReader;

class BufferCube{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double length,width,height;
        System.out.println("Enter length:");
        length = Double.parseDouble(reader.readLine());
        System.out.println("Enter width:");
        width = Double.parseDouble(reader.readLine());
        System.out.println("Enter height:");
        height = Double.parseDouble(reader.readLine());

        System.out.println("Volume = " + length*width*height);
    }
}