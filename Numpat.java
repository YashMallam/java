package practice;

public class Numpat {

	public static void main(String[] args) {
		for (int r=1,gap=10;r<=5;r++) {
			for (int y=1;y<=gap;y++) {
				System.out.print(" ");
			}
			for (int c=1;c<=r;c++) {
				System.out.print(r+"   ");
			}
			System.out.println();
			gap=gap-2;
		}
	}

}
