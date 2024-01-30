package practice;

public class PrimeorNotinRange {
	
	static boolean isPrimeorNot(int n) {
		int i=2;
		boolean res=true;
		for(;(i<n/2)&&(n%i!=0);i++);
		if(i<n/2)res= false;
		return res;
	}

	public static void main(String[] args) {
		for(int i=100,i<=200;i++) {
			
		}

	}

}
