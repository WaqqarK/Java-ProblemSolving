
public class HcfComplex {
	public static void main(String [] args) {
		int num1 = 60;
		int num2 = 72;
		
		while(num1 != num2) {
			if(num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		System.out.println("HCF for both input numbers are : " +num1);
	}

}
