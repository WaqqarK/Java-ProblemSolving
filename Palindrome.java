
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121121;
		int temp = num;
		int reverse = 0; // initialized variable reverse
		
		while(temp != 0) {
			reverse = reverse * 10 + temp % 10; // storing numbers 1 unit character at a time in reverse as for number
			temp = temp / 10; // decreasing number size by 1 unit character at a time
		}
		
	// System.out.println("Reverse of 121121 : "+reverse); // number obtained at the end of while loop
		
		if(num == reverse) 
			System.out.println("Number is Palindrome : "+reverse);
		
		else 
			System.out.println(num+" : is not a Palindrome number");
		
	}

}