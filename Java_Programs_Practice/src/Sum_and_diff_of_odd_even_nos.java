import java.util.Scanner;
public class Sum_and_diff_of_odd_even_nos {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner Scan = new Scanner(System.in);
			System.out.println("enter the starting no:- ");
			int x = Scan.nextInt();
			System.out.println("enter the last no:- ");
			int y = Scan.nextInt();
			int sum=0;int sum1=0;
			if(x<y) {
				System.out.println("The even no in the given range");
				for(int i=x;i<=y;i++){
					if(i%2==0) {
						sum=sum+i;
						System.out.print(i+", ");
					}
				}
				System.out.println("The sum of even no "+sum);
				System.out.println("The odd no in the given range");
				for(int k=x;k<=y;k++) {
					if(k%2!=0) {
				        sum1=sum1+k;
						System.out.print(k+", ");
				    }
			    }
				System.out.println("The sum of odd no "+sum1);
			}
			if(x>y){
				System.out.println("The even no in the given range");
				for(int j=x;j>=y;j--){
					if(j%2==0) {
						sum=sum+j;
						System.out.print(j+", ");
					}
				}
				System.out.println("The sum of even no "+sum);
				System.out.println("The odd no in the given range");
				for(int l=x;l>=y;l--) {
					if(l%2!=0) {
						sum1=sum+l;
						System.out.print(l+", ");
					}
				}
				System.out.println("The sum of odd no "+sum1);

		}

		}
}
