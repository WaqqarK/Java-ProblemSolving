  public class ComputingNumbers {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 4;
		
		int result = 1;
		
		for(int i = 0; i<num2; i++)
		{
			result = result * num1;
		}
		System.out.println(result);
		}
	}
  
  
/*
  This is one more option we can prefer to solve as naive solution
 
	   public class ComputingNumbers {
		public static void main(String[] args) {
			int num1 = 3;
			int num2 = 1;
			int temp = num1;
			int result = 0;
			if(num2 == 0)
			{
				System.out.println(1);
			}
			else {
			for(int i = num2 ; i > 1; i--)
			{
				result = temp * num1;
				num1 = result;
			}
			System.out.println(num1);
			}
		}
		}
   
 */
  




 
  

	
	
