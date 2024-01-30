package practice;

public class Functionwitharg {
	static void design(char c1,char c2) {
		for(int i=1;i<10;i++) {
			System.out.print(c1);
		}
		System.out.println();
		for(int i=1;i<10;i++) {
			System.out.print(c2);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		design('.','*');
		System.out.println("hello");
		design('+','#');
		System.out.println("welcome");
		design('&','$');

	}

}
