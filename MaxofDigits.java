package practice;

public class MaxofDigits {

	public static void main(String[] args) {
		int n=24597;
		int max=findMax(n);
		System.out.println("Max value is "+ max);
	}
	private static int findMax(int n) {
		int max=0,r;
		while(n>0) {
			r=n%10;
			n=n/10;
			if(r>max)max=r;
		}
		return max;
	}

}
