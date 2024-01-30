package practice;

public class ArrayCopyElements {

	public static void main(String[] args) {
		int[] num1 = {23,45,62,56,78,94};
		int[] num2 = new int[num1.length];
		for(int i=0;i<num1.length;i++) {
			num2[i]=num1[i];
		}
		System.out.println("Num1 Array elements");
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]+" ");
		}
		System.out.println("num2 array elements");
		for(int i=0;i<num2.length;i++) {
			System.out.println(num2[i]);
		}
		

	}

}
