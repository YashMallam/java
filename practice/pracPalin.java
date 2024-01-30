package practice;

public class pracPalin {

	public static void main(String[] args) {
		String s="mallesh";
		String newS="";
		for(int i=s.length()-1;i>=0;i--) {
			newS=newS+s.charAt(i);
		}
		if(s.contentEquals(newS)) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		

	}

}
