package practice;

public class Numpat3 {

	public static void main(String[] args) {
		for (int r=1;r<=9;r++) {
			for (int c=1,v=r;c<=9;c++,v++) {
				if(v>9) v=1;
				System.out.print(v+" ");	
			}
			System.out.println();
		}

	}

}
