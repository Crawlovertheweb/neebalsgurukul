package Practiceset;

class EvenThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) 
        {
        	if(i%2==0)
        	{
            System.out.println("Even: " + i);
            try {
                Thread.sleep(550); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) 
        {
        	if(i%2!=0)
        	{
         System.out.println("Odd: " + i);
            try {
                Thread.sleep(550); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}
public class Assignment_no_12_ques2 
{
public static void main(String[] args) 
{
	EvenThread e1 = new EvenThread();
	OddThread o1 = new OddThread();
	e1.start();
	o1.start();
	
	
}
	

}
