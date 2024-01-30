package practice;

public class PrimeorNot2 {
	static boolean isPrimeorNot(int n) {
		int i=2;
		for(;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num=29;
		System.out.println("Result "+isPrimeorNot(num));
		

	}

}
