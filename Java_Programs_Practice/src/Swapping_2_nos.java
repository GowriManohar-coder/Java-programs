import java.util.Scanner;
public class Swapping_2_nos {
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the first no X:- ");
		int x = Scan.nextInt();
		System.out.println("enter the second no Y:- ");
		int y = Scan.nextInt();
		
		int z=y;
		y=x;
		x=z;
		System.out.println("first no X = "+x);
		System.out.println("second no Y= "+y);
		

	}

}
