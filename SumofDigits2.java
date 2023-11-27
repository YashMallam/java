package practice;

public class SumofDigits2 {

	public static void main(String[] args) {
		int num=657,r,sum=0;
		while(true) {
			r=num%10;
			num=num/10;
			sum=sum+r;
			if(num==0) {
				if(sum>9) {
					num=sum;
					sum=0;
				}
				else {
					break;
				}
			}
		}
		System.out.println(sum);

	}

}
