import java.util.Scanner;
public class Check_positive_or_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "negtive",j = "positive";
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the number :-");
		int x=Scan.nextInt();
		
		String z = (x<0)?i:j;
		
		System.out.println("The entered value is a "+z+" no");
		

	}

}
