import java.util.Scanner;
public class Program_to_print_no_of_digits_alphabets_and_symbols {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence:-");
		String str=scan.nextLine();
		
		String ustr=str.toUpperCase();
		
		int count=0;
		int counter=0;
		int x=0;
		for(var i=0;i<str.length();i++) {
			char ch=ustr.charAt(i);
			if(ch>='0'&&ch<='9')
				count++;
			if(ch>='A'&&ch<='Z')
				counter++;
			if(ch==' ')
				x++;
		}
		int z=(str.length()-count-counter-x);
		System.out.println(z);
		System.out.println("No of digits are:- "+count);
		System.out.println("No of alphabets are:- "+counter);
		System.out.println("no of words are:-"+(x+1));
		System.err.println("no of symbols are:-"+z);
		

	}

}
