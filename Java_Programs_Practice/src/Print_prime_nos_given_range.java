import java.util.Scanner;

public class Print_prime_nos_given_range {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the starting no:- ");
		int x = Scan.nextInt();
		System.out.println("enter the last no:- ");
		int y = Scan.nextInt();
		
		if(x<y) {
			System.out.println("The prime no between given range are:-");
			for(int i=x;i<=y;i++) {
				int count=0;
			for(int j=2;j<i;j++){
				if(i%j==0)
					count++;
				}
			if(count==0)
				System.out.println(i);
		}
		}
		if(x>y) {
			System.out.println("The prime no between given range are:-");
			for(int i=x;i>=y;i--) {
				int count=0;
			for(int j=2;j<i;j++){
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		}
		}

	}

}
