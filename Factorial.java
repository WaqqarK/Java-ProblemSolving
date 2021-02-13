
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int result = 1;
		for(int i = 2; i <= num; i++) // iterate over all number till condition is correct
			result = result * i; //updating result with each iteration
		
		System.out.println("Factorail of 5 : " +result); // for loop condition becomes false and iteration stops and prints out last update value of result
	}

}
