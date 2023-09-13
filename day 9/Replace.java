package neebalgurukul.day9;
//assingment no 5
public class Replace {

	public static void main(String[] args) 
	{
String str="Mississippi";
		
		char a='i';
		char b='e';
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==a) {
				ch[i]=b;
			}
		}
		String result=new String(ch);
		System.out.println(result);
	}

}
