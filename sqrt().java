import java.util.Scanner;
 
public class Square1 {
    public static void main(String args[]) {
         
        Double num;
        Scanner sc= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num=sc.nextDouble();
         
        Double square = num*num;
        System.out.println("Square of "+ num + " is: "+ square);
    }
 
}
