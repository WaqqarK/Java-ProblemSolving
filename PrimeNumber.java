
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 37;
		int count = 0;

		if(num == 1) 
		{
			System.out.println("Not Prime : "+num);
		}
		else
		{

			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					count++;
				}
			}
			if(count >= 1) {
				System.out.println("Number is Not Prime : "+num);
			}else {
				System.out.println("Number is Prime : "+num);
			}
		}
	}
}
