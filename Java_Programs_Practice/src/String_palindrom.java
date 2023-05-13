import java.util.*;
public class String_palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word:-");
		String str = scan.nextLine();
		String rts = reverseString(str);
		
		System.out.println(rts);
		
		if(str.equals(rts)) {
			System.out.println("The word is palindrom");}
		else
			System.out.println("The word is not a palindrom");
		
		
	}
		public static String reverseString(String s) {
		    StringBuilder sb = new StringBuilder(s);
		    sb.reverse();
		    return sb.toString();
		
		 }

}
