import java.util.Scanner;

public class program_to_find_even_odd_and_prime_no_of_an_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[]= new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("enter the no "+(i+1));
			int x = scan.nextInt();
			num[i] = x;
		}
		System.out.println("The even nos are:-");
		for(int i=0;i<10;i++) {
			if(num[i]%2==0)
				System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.println("The odd nos are:-");
		for(int i=0;i<10;i++) {
			if(num[i]%2!=0)
				System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.println("The prime nos are:-");
		for(int i=0;i<10;i++) {
			int count=0;
			for(int j=2;j<num[i];j++) {
				if(num[i]%j==0)
					count++;
			}
			if(count==0)
				System.out.print(num[i]+",");
				
		}

		
	}

}
