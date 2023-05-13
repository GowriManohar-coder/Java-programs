import java.util.Scanner;

public class Swapping_first_last_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int x = Scan.nextInt();
		String str = Integer.toString(x);
		var firstNo = str.charAt(0);
		var lastNo = str.charAt(str.length()-1);
		System.out.print(lastNo);
		for(int i=1; i<str.length()-1;i++) {
			System.out.print(str.charAt(i));
		}
		System.out.print(firstNo);
			
		
	}

}
