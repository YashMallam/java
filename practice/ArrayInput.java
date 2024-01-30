package practice;

public class ArrayInput {

	public static void main(String[] args) {
		int[] num= {23,35,76,88,26,92};
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Max number"+max);
		System.out.println("Min number"+min);
	}

}
