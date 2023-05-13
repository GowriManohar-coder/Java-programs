import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int x = Scan.nextInt();
		int reverse=0;
		int org=x;
		for(int i=1;x>0;i++) {
			int digit=x%10;
			reverse=reverse*10+digit;
			x=x/10;
		}
		System.out.println(reverse);
		
		if(org==reverse)
			System.out.println("The no is a palindrome");
		else
			System.out.println("The no is not a palindrome");
		

	}

}
