package practice;

public class SumOfDigits {
	static int Sum(int a) {
		int sum=0;
		while(a!=0) {
			sum=sum+a%10;
			a=a/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int a=453;
		System.out.println(Sum(a));
	

	}

}
