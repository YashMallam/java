package practice;

public class ArraySub {

	public static void main(String[] args) {
		int[]a= {10,12,14,16,18,20};
		int[]b= {10,12,14,22,24,26};
		int[]c=new int[a.length+b.length];
		int resIndex=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]!=b[j]) {
					System.out.println(a[i]);;
				}
				
			}
			
		}
		

	}

}
