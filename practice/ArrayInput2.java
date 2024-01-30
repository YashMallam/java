package practice;

import java.util.Scanner;

public class ArrayInput2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter number of elements");
		int size=sc.nextInt();
		int[]num=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		int max=num[0];
		int min=num[1];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(min > num[i]) {
				min=num[i];
			}
		}
		System.out.println("max is"+max);
		System.out.println("min is"+min);
		

	}

}
