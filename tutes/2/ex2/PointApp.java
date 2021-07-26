import java.util.Scanner;
import java.lang.Math;

class Point3D{
    private double point[] = new double[3];
    double distance;
    Point3D(){
        for(int i = 0; i < 3; i++){
            point[i] = 0;
        }

        distance = 0;
    }

    Point3D(double [] coordinates){
        for(int i = 0; i < 3; i++){
            point[i] = coordinates[i];
        }

        for(int i = 0; i < 3; i++){
            distance += Math.pow(point[i],2);
        }

        distance = Math.sqrt(distance);
    }

    public void dispDistance(){
        System.out.println("Distance : " + this.distance);
    }

}

public class PointApp{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        double coordinates[] = new double[3];
        System.out.println("Enter coordinates:");
        for(int i = 0; i < 3; i++){
            coordinates[i] = ob.nextFloat();
        }

        Point3D p1 = new Point3D(coordinates);
        p1.dispDistance();
    }
}