
class VovelException extends Exception{
	public VovelException(String m) {
		super(m);
	}
}

public class Vowels 
{
public static int Vovels(String str2)throws VovelException{
		
		int total=0;
		for(char c:str2.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                total++;
            }
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str= "Raunak singh";
			int count=Vovels(str);
			System.out.println("Number of Vovels: "+count);
		}catch(VovelException e) {
			System.out.println("Exception: "+e.getMessage());
		}		
	}
}
