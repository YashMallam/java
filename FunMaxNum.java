package practice;

public class FunMaxNum {

	static int MaxNum(int a,int b,int c) {
		if((a>b)&&(a>c)) {
			return a;
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	
	public static void main(String[] args) {
		int x=10,y=30,z=45;
		System.out.println("Max value is "+MaxNum(x,y,z));
		

	}

}
