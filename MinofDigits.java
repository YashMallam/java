package practice;

public class MinofDigits {

	public static void main(String[] args) {
		int n=2546;
		int min= findmin(n);
		System.out.println("min value is "+ min);
	}
	private static int findmin(int n) {
		int min=9,r;
		while(n>0) {
			r=n%10;
			n=n/10;
			if(r<min)min=r;
		}
		return min;
	}

}
