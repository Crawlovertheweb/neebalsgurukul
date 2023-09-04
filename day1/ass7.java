package neebalgurul.day1;

public class ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 2350;
		int hr =time/100;
		int min = time%100;
		boolean b =(hr<12?true:false);
		if(hr>12)
		{
			hr =hr-12;
		}
		else
		{
			hr =12;
			
		}
		if(b=true)
		{
			System.out.println(hr+":" +min+"PM");
			
		}
		else
		{
			System.out.println(hr+":"+min+"AM");
		}
	}

}
