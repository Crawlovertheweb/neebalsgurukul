package ListQueueAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Ques1 
{
public static int largest(ArrayList<Integer> a,int size,int k)
{
	PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
			int i;
				for( i=0;i<size;i++)
				{
					p.add(a.get(i));
				}
			int l=k-1;
			while(l>0)
			{
				p.poll();
				l=l-1;
			}
			return p.peek();
}


public static void main(String[] args) 
{
	ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(3,2,3,1,2,4,5,5,6));
	int size=a.size();
	int k=4;
	int r=largest(a,size,k);
	System.out.println(r);
}

}
