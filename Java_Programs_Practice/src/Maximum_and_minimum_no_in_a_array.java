import java.util.*;
public class Maximum_and_minimum_no_in_a_array {

	public static void main(String[] args) {
		int num[]=new int[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("enter the no "+(i+1)+" :-");
		    int x = scan.nextInt();
		    num[i]=x;
		}
		int maximum=num[0];
		int minimum=num[0];
		
		for(int i=0;i<10;i++) {
			if(num[i]>maximum)
				maximum=num[i];
			if(num[i]<minimum)
				minimum=num[i];
		}
		System.out.println("The maximum no is "+maximum);
		System.out.println("The maximum no is "+minimum);
	}

}
