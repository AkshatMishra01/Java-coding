package programpackage;
import java.lang.ArrayIndexOutOfBoundsException;
public class nesttry {
public static void main(String[] args) {
	try{
    	int array[] = {1,2,3,4,5};
    	System.out.println(array[5]);
         try{
            System.out.println("Nested try block");
            int x = 9/0;
            System.out.println(x);
         }
         catch(ArithmeticException e1){
            System.out.println("Arthmetic Exception");
         }
	}
	catch(java.lang.ArrayIndexOutOfBoundsException e) {
		 System.out.println("ArrayIndexOutOfBoundsException");
	 }
	finally {
		System.out.println("Done execution");
	}
}
}
