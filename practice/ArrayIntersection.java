package practice;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] a= {10,12,14,15,18,20,24,28};
		int[] b= {10,13,14,16,18,25,28,32};
		int[]res= new int[a.length+b.length];
		int resIndex=0;
		for(int i=0;i<a.length;i++,resIndex++) {
		res[resIndex]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					res[resIndex]=a[j];
					System.out.println(res[i]);
				}
			}
		}
		/*boolean isFound=true;
		for(int i=0;i<b.length;i++) {
			isFound=true;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					res[resIndex++]=b[i];
				}
			}
		}*/
		/*for(int i=0;i<resIndex;i++) {
			System.out.println(res[i]+" ");
		}*/
		

	}

}
