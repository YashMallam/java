package practice;

public class BinPat2 {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			for( int c=1,t;c<=r;c++) {
				if((r+c)%2==0) t=1;
				else t=0;
				System.out.print(t+" ");
			}
			System.out.println();
		}

	}

}
