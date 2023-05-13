import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int x = Scan.nextInt();
		int org=x;
		int sum=0;
		for(int i=1;x>0;i++) {
			int digit=x%10;
			int cube=digit*digit*digit;
			sum=sum+cube;		
			x=x/10;
			System.out.println(cube);
		}
		System.out.println(sum);
		
		if(org==sum)
			System.out.println("The no is a armstrong");
		else
			System.out.println("The no is not a armstrong");
		

	}

}
