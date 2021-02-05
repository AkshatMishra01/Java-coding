class Smethod
{
    
    public static int sum(int a, int b)  //static method declaration.
    {
        return a + b;
    }
}

class Substrac
{	
     public int sub(int a, int b) // non - static method decleration.
    {
	return a - b;
    }
}

public class Main{ //main class
    public static void main(String[] args)
    {
        // static method calling in java.
        
        int s = Smethod.sum(3, 4);
        System.out.print("sum is = " + s);

	// non static method calling in java.
  
	Substrac s1 = new Substrac();
	int add = s1.sub(6,5);
	System.out.println("Difference is = " + add);
    }
}

 
