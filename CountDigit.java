
public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 905730465;

			int count = 0; //initialized counter for keeping track of number of time loop iterates
			
			while(a != 0) {
				a = a/10;
				count++; //to keep updating the counter value as per number of iterations
			}
			System.out.println("Number of Digit: "+count); //after end of loop we print counter value
		}
		
	

}
