
public class GreaterNumber {
	public static void main(String[] args) {
		int num1 = 34;
		int num2 = 45;
		int num3= 14;
		
		if(num1 > num2 && num1 > num3)
			System.out.println("Greates Number : "+num1);
		
		if(num2 > num3 && num2 > num1)
			System.out.println("Greates Number : "+num2);
		
		if(num3 > num1 && num3 > num2)
			System.out.println("Greates Number : "+num3);
	}

}
