import java.util.Scanner;
public class Factorial_of_a_number {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the starting no:- ");
		int x = Scan.nextInt();
		int fac=1;
		System.out.println("The factorial of given no is");
		for(int i=x;i>=2;i--){
		 fac = fac*i;
			System.out.print(i+"x");
		}
		System.out.println("1="+fac);
		}
}