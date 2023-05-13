import java.util.Scanner;
public class Print_n_to_m_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the first no:-");
		int n = Scan.nextInt();

		System.out.println("enter the first no:-");
		int m = Scan.nextInt();
		if(m<n) {
		for(int i=n;i>=m;i--) {
			System.out.println(i );
		}
		}
		else
			System.out.println("first no should be greater then second no");
		
		

	}

}
