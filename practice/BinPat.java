package practice;

public class BinPat {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			for( int c=1,t;c<=r;c++) {
				if(c%2==0) t=0;
				else t=1;
				System.out.print(t+" ");
			}
			System.out.println();
		}

	}

}
