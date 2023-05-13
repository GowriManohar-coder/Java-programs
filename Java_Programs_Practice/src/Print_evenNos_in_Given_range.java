import java.util.Scanner;
public class Print_evenNos_in_Given_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the starting no:- ");
		int x = Scan.nextInt();
		System.out.println("enter the last no:- ");
		int y = Scan.nextInt();
		
		if(x<y) {
			System.out.println("The EVEN no between given range are:-");
			for(int i=x;i<=y;i++){
				if(i%2==0)
					System.out.println(i);
			}
		}
		if(x>y){
			System.out.println("The EVEN no between given range are:-");
			for(int j=x;j>=y;j--){
				if(j%2==0)
					System.out.println(j);
			}
		}

	}

}
