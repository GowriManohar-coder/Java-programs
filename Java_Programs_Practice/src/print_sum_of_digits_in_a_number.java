import java.util.Scanner;
public class print_sum_of_digits_in_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int x = Scan.nextInt();
		int reverse=0,sum=0;
		int org=x;
		for(int i=1;x>0;i++) {
			int digit=x%10;
			x=x/10;
			sum=sum+digit;
		}
		System.out.println(sum);
		
		
	}

}
