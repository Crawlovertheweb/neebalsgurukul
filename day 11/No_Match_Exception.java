class Nomatch extends Exception {
    public Nomatch(String message) {
        super(message);
    }
}
public class No_Match_Exception {

	public static void main(String[] args) {
		  try {
	            String str = "Cat"; 
	            matchString(str);
	        } catch (Nomatch e) {
	            System.out.println("Exception: " + e.getMessage());
	        }

	}



public static void matchString(String input) throws Nomatch {
    if (!input.equals("Billi")) {
        throw new Nomatch("String does not match 'Cat'");
    } else {
        System.out.println("String matches 'Cat'");
    }
}

}
