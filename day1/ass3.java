package neebalgurul.day1;

public class ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days =1020;
		int year = (int) (1020/365.25);
		System.out.println(year);
		int months = (int) (days % 365.25) / 30;
        int weeks = (int) ((days % 365.25) % 30) / 7;
        int remainingDays = (int) ((days % 365) % 30) % 7;

        System.out.println(year + " Years : " + months + " Months : " + weeks + " Weeks : " + remainingDays + " Days");
		
	}

}
