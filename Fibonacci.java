
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int series = 10;
		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		System.out.print(num1+ " " + num2);

		for(int i = 2; i < series ; i++)
		{
			sum = num1 + num2;
			System.out.print(" "+sum);
			num1 = num2;
			num2 = sum;
		}

	}

}
