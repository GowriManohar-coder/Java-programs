import java.util.*;

public class String_sort {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the word:-");
			String str = scan.nextLine();
			char arr[] = str.toCharArray();
			
			Arrays.sort(arr);
			
			 System.out.println(arr);

	}

}

