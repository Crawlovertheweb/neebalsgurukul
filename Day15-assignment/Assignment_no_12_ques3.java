package Practiceset;

public class Assignment_no_12_ques3 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading thread1=new Threading("Thread 1");
		Threading thread2=new Threading("Thread 2");	
		
		thread1.start();
		thread2.start();
		
		if(thread1.isAlive()) {
			System.out.println(thread1.getName()+"is Running!!!");
		}
		else {
			System.out.println(thread1.getName()+"is Not Running!!!");
		}
		
		if(thread1.isAlive()) {
			System.out.println(thread2.getName()+"is Running !!!");
		}
		else {
			System.out.println(thread2.getName()+"is Not Running!!!");
		}
	}

}
class Threading extends Thread{
	public Threading(String name){
		super(name);
	}
	@Override
	public void run() {
		System.out.println(getName()+"is Running!!!");
	}
}
