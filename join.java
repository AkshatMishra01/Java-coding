package projrctjava;
import java.lang.*;

class Jointhread extends Thread
{
 public void run()
 {
	 int i;
     for (i = 0; i < 2; i++)
     {
         try
         {
             Thread.sleep(1000);
             System.out.println("Thread No:" + Thread.currentThread().getName());
         }

         catch(InterruptedException ex)
         {
             System.out.println("exception ocurred" + ex);
         }
         System.out.println(i);
     }
 }
}
public class Join {
	public static void main (String[] args)
    {
        Jointhread o1 = new Jointhread();
        Jointhread o2 = new Jointhread();
        Jointhread o3 = new Jointhread();
        o1.start();
        try
        {
            System.out.println("Thread No: " + Thread.currentThread().getName());
            o1.join();
        }
  
        catch(InterruptedException ex)
        {
            System.out.println("exception ocurred" + ex);
        }
        o2.start();
        try
        {
            System.out.println("Thread No: " + Thread.currentThread().getName());
            o2.join();
        }
        catch(InterruptedException ex)
        {
            System.out.println("exception ocurred" + ex);
        }
        o3.start();
        try
        {
            System.out.println("Thread No: " + Thread.currentThread().getName());
            o3.join();
        }
        catch(InterruptedException ex)
        {
            System.out.println("exception ocurred" + ex);
        }
    }
}
