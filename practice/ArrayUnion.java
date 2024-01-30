package practice;

public class ArrayUnion {

	public static void main(String[] args) {
		int[] a= {23,10,15,18,20,24,28};
		int[] b= {12,15,21,24,10,36,45};
		int[] res=new int[a.length+b.length];
		//copy a elements
		int resIndex=0;
		for(int i=0;i<a.length;i++,resIndex++) {
			res[resIndex]=a[i];
		}
		//copy b elements
		boolean isFound=false;
		for(int i=0;i<b.length;i++) {
			isFound=false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					isFound=true;
				}
			}
			if(isFound==false) {
				res[resIndex++]=b[i];
			}
		}
		for(int i=0;i<resIndex;i++) {
			System.out.println(res[i]+" ");
		}
	}
	
}
