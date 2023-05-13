import java.util.Scanner;
public class Print_m_to_n_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the first no:-");
		int m = Scan.nextInt();

		System.out.println("enter the first no:-");
		int n = Scan.nextInt();
		if(m<n) {
		for(int i=m;i<=n;i++) {
			System.out.println(i );
		}
		}
		else
			System.out.println("first no should be less then second no");
		
		

	}

}
