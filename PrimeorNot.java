package practice;

public class PrimeorNot {
	static boolean primeorNot(int n) {
		boolean isPrime=true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		int num=57;
		System.out.println(" result " + primeorNot(num));


	}

}
