package practice;

public class ArrayChar {

	public static void main(String[] args) {
		char ch[];
		ch=new char[5];
		ch[0]='2';
		ch[1]='3';
		ch[2]='5';
		ch[3]='8';
		ch[4]='1';
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]+" ");
		}

	}

}
