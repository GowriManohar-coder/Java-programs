import java.util.Scanner;
public class Print_multiplication_table {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner Scan = new Scanner(System.in);
			System.out.println("Which table do you want:-");
			int x = Scan.nextInt();
			System.out.println("Upto which no you want:-");
			int y = Scan.nextInt();
			
			for(int i=1;i<=y;i++) {
				System.out.println(x+" x "+i+" = "+(x*i));
			}
		}
}