package practice;

public class FunEvenorodd {
	static boolean isEvenOrOdd(int a) {
		if(a%2==0)return true;
		else return false;
	}

	public static void main(String[] args) {
		int num=7;
		System.out.println("result is "+ isEvenOrOdd(num));
		

	}

}
