package practice;

public class Funwithonlyret {
	static float dollarInRupees() {
		return 87.54f;
	}
	static String indCapital() {
		return "delhi";
	}

	public static void main(String[] args) {
		float dollar=100;
		float rupees=dollar*dollarInRupees();
		System.out.println("Indian Rupees---"+rupees);
		System.out.println("india capital "+indCapital());
			

	}

}
