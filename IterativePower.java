
public class IterativePower {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		int result = 1;
		
		while(num2 > 0)
		{
			if(num2 % 2 != 0)
			{
				result =result * num1;
			}
			num1 = num1 * num1;
			num2 = num2/2;
		}
		System.out.println(result);
	}
}
