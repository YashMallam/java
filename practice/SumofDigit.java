package practice;

public class SumofDigit {

	public static void main(String[] args) {
		int n=2584;
		int res= findSum(n);
		System.out.println("Total Sum "+res);

	}
	private static int findSum(int n) {
		int r,sum=0;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}

}
