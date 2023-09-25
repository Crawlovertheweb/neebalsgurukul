package Test;

public class Problem2 
{
	static int canPlayerWin(int nums[],int left,int right)
	{
		if(left==right)
		return nums[left];
		int chooseleft = nums[left]-canPlayerWin(nums,left+1,right);
		int chooseright = nums[right]-canPlayerWin(nums,left,right-1);
		
		return Math.max(chooseleft, chooseright);
		
	}
	public static void main(String[] args) 
	{
		int n [] = {1,5,2};
		boolean result  = canPlayerWin(n,0,n.length-1)>=0;
		System.out.println(result);
				
		
	}
}
