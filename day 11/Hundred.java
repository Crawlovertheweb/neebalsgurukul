import java.util.Random;
import java.util.Scanner;

public class Hundred {

	public static void main(String[] args)
	{
		int arr[]=GenerateArray(100);
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("Enter the index:");
				int a=Integer.parseInt(sc.nextLine());
				
				if(a>0 && a<100) {
					int e=arr[a];
					System.out.println("Array element at "+a+" is "+e);
				}else {
					System.out.println("Array index out of bound please enter between 0 to 99");
				}
			}catch(NumberFormatException e){
				System.out.println("Invalid Input!!!");
			}
			
		}

	}
	private static int[] GenerateArray(int i) {
		// TODO Auto-generated method stub
		int array[]=new int[i];
		Random rand=new Random();
		
		for(int j=0;j<i;j++) {
			array[j]=rand.nextInt(1000);
		}
		
		return array;
	}

}
