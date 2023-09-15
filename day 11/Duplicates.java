import java.util.Scanner;
import java.util.Vector;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				Vector<Integer>num=new Vector<>();
				System.out.println("Enter the list of integers:");
				try {
					String str=sc.nextLine();
					String arr[]=str.split(" ");
					
					for(String str2:arr) {
						int num2=Integer.parseInt(str2);
						if(num.contains(num2)) {
							throw new DuplicateException(num2);
						}else {
							num.add(num2);
						}
					}
					System.out.println("No Duplicate Numbers!!!");
					
				} catch (NumberFormatException e) {
					System.out.println("Error: Invalid input please enter Integers only!!!");
				}catch(DuplicateException e) {
					System.out.println("Error: Duplicate Number Found"+e.getX());
				}
			}

		}

		class DuplicateException extends Exception{
			private int x;
			DuplicateException(int num3){
				x=num3;
			}
			public int getX() {
				return x;

	}

}
