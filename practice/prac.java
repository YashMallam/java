package practice;

public class prac {

	public static void main(String[] args) {
		for(int i=1,gap=10;i<=5;i++) {
			for(int y=1;y<gap;y++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
			gap=gap-2;
		}

	}

}
