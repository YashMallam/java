package practice;

public class Summation {

	public static void main(String[] args) {
	int eSum=0,oSum=0;
	for (int e=2,o=1;e<=10 || o<=10;e=e+2,o=o+2) {
		eSum=eSum+e;
		oSum=oSum+o;
	}
     System.out.println("total even sum "+eSum);
     System.out.println("total odd sum"+oSum);
     
     int evenSum=0,oddSum=0;
     for (int num=1;num<=10;num++) {
    	 if(num%2==0) {
    		 evenSum=evenSum+num;
    	 }
    		 else{
    			 oddSum=oddSum+num;
    		 }
    	 }
     System.out.println("toal even sum"+evenSum);
     System.out.println("total odd sum"+oddSum);
     }
	}