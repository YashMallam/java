package practice;

public class ArraySum {

	public static void main(String[] args) {
		int[] num1= {12,23,35,46,57,82};
		int[] num2= {18,29,30,47,53,85};
		int[] num3= new int[num1.length+num2.length];
		for(int i=0;i<num1.length;i++) {
			num3[i]=num1[i];
		}
		for(int i=0;i<num2.length;i++) {
			num3[num1.length+i]=num2[i];
		}
		for(int i=0;i<num3.length;i++) {
		System.out.print(num3[i]+" ");
		}

	}

}
