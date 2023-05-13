import java.util.Scanner;

public class print_the_biggerNo_in_the_digit {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner Scan = new Scanner(System.in);
				System.out.println("Enter the number:-");
				int x = Scan.nextInt();
				String str = Integer.toString(x);
				char bigger = str.charAt(0);
				for(int i=1;i<str.length();i++) {
					if(str.charAt(i)>bigger)
						bigger=str.charAt(i);
				}
				System.out.println("The bigger in the digit is "+bigger);
					
	}

}
