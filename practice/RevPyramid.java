package practice;

public class RevPyramid {

	public static void main(String[] args) {
		for(int r=1,gap=2;r<=5;r++) {
			for(int y=1;y<=gap;y++) {
				System.out.print(" ");
			}
			for(int c=5,t;c>=r;c--) {
				if(c%2==0)t=0;
				else t=1;
				System.out.print(t+"  ");
			}
			System.out.println();
			gap=gap+2;
			
		}

	}

}
