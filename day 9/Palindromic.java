package neebalgurukul.day9;

public class Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str= "noon";
				String lp="";
				for(int i=0;i<str.length();i++) {
					for(int j=i+1;j<=str.length();j++) {
						String substr=str.substring(i,j);
						if(palindrome(substr)&&substr.length()>lp.length()) {
							lp=substr;
						}
					}
				}
				if(lp.length()>1) {
					System.out.println("Longest Palindrome substring:"+lp);
				}
				else {
					System.out.println("No Palindrome substring:");
				}
				
			}
			
			static boolean palindrome(String s) {
				int left=0;
				int right=s.length()-1;
				
				while (left < right) {
		            if (s.charAt(left) != s.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
			}

	}

