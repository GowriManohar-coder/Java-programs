import java.util.Scanner;
public class Print_factors_noOfFactors {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the no for which factors are requried:- ");
		int x = Scan.nextInt();
		int count=0;
		System.out.println("The Factors of given no are:- ");
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				count++;
			System.out.println(i+" ");
			}
		}
		System.out.println("No OF factors = "+count);

	}

}
