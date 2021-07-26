import java.util.Scanner;
import java.lang.Math;

private class Point3D{
    private float point[] = new float[3];
    float distance;
    Point3D(){
        for(int i = 0; i < 3; i++){
            point[i] = 0;
        }

        distance = 0;
    }

    Point3D(float[] coordinates){
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
        float coordinates[] = new float[3];
        System.out.println("Enter coordinates:");
        for(int i = 0; i < 3; i++){
            coordinates[i] = ob.nextFloat();
        }

        Point3D p1 = new Point3D(coordinates);
        p1.dispDistance();
    }
}