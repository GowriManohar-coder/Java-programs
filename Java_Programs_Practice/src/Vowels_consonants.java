import java.util.*;
public class Vowels_consonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence:-");
		String str=scan.nextLine();
		
		String ustr=str.toUpperCase();
		
		char A,E,I,O,U;
		int count=0;
		int counter=0;
		int x=0;
		for(var i=0;i<str.length();i++) {
			char ch=ustr.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				count++;
			if(ch>='A'&&ch<='Z')
				counter++;
		}
		int z=counter-count;
		System.out.println("No of vowels are:- "+count);
		System.out.println("No of consonents are:- "+z);
		System.out.println("difference of vowels and consonent is :- "+(z-count));
		

	}

}
