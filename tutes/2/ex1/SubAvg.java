import java.util.Scanner;

class Student{
    private float marks[] = new float[3];
    private float avg;
    private String ID;
    private String name;

    public Student(String name , String ID , float[] marks){
        this.name = name;
        this.ID = ID;

        for(int i = 0; i < 3; i++){
            this.marks[i] = marks[i];
        }

        avg = -1;
    }

    public void calcAvg(){
        for(int i = 0; i < 3; i++){
            this.avg += marks[i];
        }

        avg /= 3;
    }

    public float getAvg(){
        if(avg != -1){
            return this.avg;
        }else{
            System.out.println("Average has not been set!");
            return -1;
        }
    }

    public void display(){
        System.out.println("ID : " + this.ID );
        System.out.println("Name : " + this.name);
        System.out.println("Average : " + this.avg);
    }
}

class SubAvg{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);

        String ID,name;
        float[] marks = new float[3];

        System.out.println("Enter student ID:");
        ID = ob.nextLine();
        System.out.println("Enter student name:");
        name = ob.nextLine();

        System.out.println("Enter marks of the 3 subjects:");

        for(int i = 0; i < 3; i++){
            marks[i] = ob.nextFloat();
        }

        Student st1 = new Student(name,ID,marks);
        st1.calcAvg();
        st1.display();
    }
}