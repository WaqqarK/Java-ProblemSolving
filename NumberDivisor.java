
public class NumberDivisor {
	public static void main(String[] args) {
		int num = 100;
		
		if(num < 1) {
			System.out.println("Please Enter a Valid Positive Number");
		}
		else {
			for(int i=1; i <= num; i++)
			{
				if(num % i == 0)
				{
					System.out.print(" "+i);
				}
			}
		}
	}	
}
