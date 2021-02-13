
public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1425346;
		int result = 0;
		
		while(num != 0)
		{
		result = result + num % 10;
		num = num / 10;
		}
		System.out.println("Sum of entered digit : "+result);
	}

}
