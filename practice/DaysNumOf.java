package practice;
import java.util.*;

public class DaysNumOf {

	public static void main(String[] args) {
		int m,year,month,days;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of days;");
		m=s.nextInt();
		year=m/365;
		System.out.println("the number of years;"+year);
		m=m%365;
		month=m/30;
		System.out.println("The num of months;"+month);
		m=month/7;
		m=m%7;
		days=m;
		System.out.println("The num of days;"+days);

	}

}
