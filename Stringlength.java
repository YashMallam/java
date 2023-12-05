package practice;

public class Stringlength {

	public static void main(String[] args) {
		String string="Hello";
		int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=0)
				count++;
		}
		System.out.println("total characters"+ count);
	}

}
