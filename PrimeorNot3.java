package practice;

public class PrimeorNot3 {
	static boolean isPrimeorNot(int n) {
		int i=2;
		boolean res=true;
		for(;(i<n/2)&&(n%i!=0);i++);
		if(i<n/2)res= false;
		return res;
	}

	public static void main(String[] args) {
		int num=23;
		System.out.println("result is "+ isPrimeorNot(num));
		

	}

}
