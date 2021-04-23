package projrctjava;

class PrintSequenceRunnable implements Runnable{
	 
    public int PRINT_NUMBERS_UPTO=9;
    static int  number=1;
    int remainder;
    static Object lock=new Object();
 
    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-1) {
            synchronized (lock) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
 
public class Sequenceprint {
	public static void main(String[] args) {
		 
        PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(2);
        PrintSequenceRunnable runnable3=new PrintSequenceRunnable(0);
 
        Thread t1=new Thread(runnable1,"I");
        Thread t2=new Thread(runnable2,"LOVE");
        Thread t3=new Thread(runnable3,"UPES");
 
        t1.start();
        t2.start();
        t3.start();   
    }
}
