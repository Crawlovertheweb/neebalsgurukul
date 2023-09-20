package Practiceset;

public class Assignment_no_12_ques4 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]= {"Java","J2EE","Spring","JDBC"};
		Thread t1=new Thread(new CoursePrinter(course));
		Thread t2=new Thread(new CoursePrinter(course));
		Thread t3=new Thread(new CoursePrinter(course));
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class CoursePrinter implements Runnable{
	private String courses[];
	public CoursePrinter(String courses[]) {
		this.courses=courses;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(String course:courses) {
			System.out.println(Thread.currentThread().getName()+" : "+course);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
