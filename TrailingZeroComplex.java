
public class TrailingZeroComplex {
	public static void main(String args[]) {
		int num = 1000;
		int result = 0;
		
		for(int i = 5; i <= num; i = i * 5)
			result = result + num / i;
		
		System.out.println("Trailing number of Zeros: "+result);
		
	}

}
