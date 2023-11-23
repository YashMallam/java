package practice;

public class Funwithargret {
	static float convertToRupees(String Country,float Currency) {
		if(Country.equalsIgnoreCase("US")) {
			return Currency*87.54f;
		}
		else if (Country.equalsIgnoreCase("UK")) {
			return Currency*123f;
		}
		else if(Country.equalsIgnoreCase("UAE")) {
			return Currency*270f;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		float rupees=convertToRupees("US",50);
		System.out.println("US dollars in rupees "+rupees);
		rupees=convertToRupees("UK",100);
		System.out.println("UK euro in rupees "+ rupees);
		rupees=convertToRupees("UAE",150);
		System.out.println("UAE dinar in rupees"+ rupees);

	}

}
