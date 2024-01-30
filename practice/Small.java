package practice;

public class Small {

	public static void main(String[] args) {
		int a=3,b=4,c=7,d=9;
		if((a<b)&&(a<c)&&(a<d)) {
			System.out.println("the smallest is "+a);
		}
		else if((b<c)&&(b<d)) {
			System.out.println("the smallest is "+b);
		}
		else if(c<d) {
			System.out.println("the smallest is"+c);
		}
		else
		{
			System.out.println("the smallest is"+d);
		}

	}

}
