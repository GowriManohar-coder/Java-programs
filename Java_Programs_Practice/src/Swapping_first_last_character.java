import java.util.Scanner;

public class Swapping_first_last_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the string:-");
		String str = Scan.nextLine();
		var firstchar = str.charAt(0);
		var lastchar = str.charAt(str.length()-1);
		System.out.print(lastchar);
		for(int i=1; i<str.length()-1;i++) {
			System.out.print(str.charAt(i));
		}
		System.out.print(firstchar);
			
		
	}

}
