
public class TrailingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int result = 1;
		
		for(int i = 2; i <= num; i++)
			result = result * i;
		
		System.out.println(result);
		int count = 0;
		while(result % 10 == 0) {
			count++;
			result = result / 10;
		}
		System.out.println(count);
	}

}
