import java.util.Scanner;

class EvenOddNumber{
    //changed the method name to avoid confusion about the return value
    public boolean findEvenNumber(int i){//returns true if the inserted number is even
        return i % 2 == 0?true:false;//using ternary operator is a waste of code here. Use the following way instead
        //return i%2;
    }
}

class Demo{
    public static void main(String args[]){
       EvenOddNumber checkn1 = new EvenOddNumber();
       Scanner ob = new Scanner(System.in);
       int n1 = ob.nextInt();
       System.out.print("'The number you entered is even' is ");
       System.out.println(checkn1.findEvenNumber(n1)); 
    }
}