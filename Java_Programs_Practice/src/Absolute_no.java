import java.util.Scanner;
public class Absolute_no {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the no:- ");
		int x = Scan.nextInt();
		 int z = (x<0)?-x:x;
		 
		 System.out.println("The absolute of the given no is "+z);

	}

}
