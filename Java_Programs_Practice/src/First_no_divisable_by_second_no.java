import java.util.Scanner;

public class First_no_divisable_by_second_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		String i = "divisable", j = "not divisable";
		
		System.out.println("enter the 1st no:-");
		int x = Scan.nextInt();
		System.out.println("enter the 1st no:-");
		int y = Scan.nextInt();
		
		String z= (x%y==0)?i:j;
		
		System.out.println("The 1st no is "+z+" 2nd no");
		
		

	}

}
