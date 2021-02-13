import java.util.Scanner;

public class UserAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//sc is obj of Scanner class.... one class is userAdd---sc---one class is Scanner 
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		int sum = a+b;
		
		System.out.println("TOTAL SUM: "+sum);
		
		ProductBased pb = new ProductBased();
		pb.myScanner();
				
		
	}

}
