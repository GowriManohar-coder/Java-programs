import java.util.*;
public class Sum_of_nos_till_user_enter0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		List<Integer> lis = new ArrayList<>();
		var sum=0;
		for(var i=1;i<=50;i++) {
			System.out.println("ENTER THE Number "+i+" :-");
			var x=Scan.nextInt();
			lis.add(x);
			if(x==0)
				break;
			
			sum=sum+x;
		}
		System.out.println("Sum of "+lis+" is:-");
		System.out.println(sum);

	}

}
