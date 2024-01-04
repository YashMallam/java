package practice;

public class DoWhile {

	public static void main(String[] args) {
		
		int i=1;
		int number=3;
		int power=4;
		int product=1;
		
		do {
			product= number * product;
			i++;
		} while(i<=power);
		System.out.println(number + "to power of" + power +"="+ product);

	}

}
