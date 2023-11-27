package practice;

public class Palindrome {

	public static void main(String[] args) {
		String str="7447";
		String newStr="";
		for(int i=str.length()-1;i>=0;i--) {
			newStr=newStr+str.charAt(i);
		}
		System.out.println("old string "+ str);
		System.out.println("new string "+ newStr);
		if(str.contentEquals(newStr)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
