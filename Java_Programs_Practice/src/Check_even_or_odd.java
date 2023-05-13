import java.util.Scanner;
public class Check_even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "even",j = "odd";
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the no :-");
		int x = Scan.nextInt();
		
		String z = (x%2==0)?i:j;
		
		System.out.println("the entered no is "+z+" no");

	}

}
