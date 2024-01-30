package practice;

public class StringSwap2 {

	public static void main(String[] args) {
	String s1="hello";
	String s2="welcome";
	System.out.println("before swap");
	System.out.println(s1);
	System.out.println(s2);
	s2=s1+s2;
	s1=s2.substring(0,s2.length()-s1.length());
	s2=s2.substring(s1.length());
	System.out.println("after swapping");
	System.out.println(s1);
	System.out.println(s2);

	}

}
