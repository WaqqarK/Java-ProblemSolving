
public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 60;
		int num2 = 72;
		int min = 0;
		
		if(num1 > num2)
			min = num1;
		else
			min = num2;
		
		int result = min;
		
		while(result != 0) {
			if(num1 % result == 0 && num2 % result == 0)
			{
				break;
			}
		result--;
	}
		System.out.println("HCF of both numbers are : "+result);
	}
	
}
