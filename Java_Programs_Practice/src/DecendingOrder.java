import java.util.*;
public class DecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		List<String> lis = new ArrayList<>();
		
		for(var i=1;i<=3;i++) {
			System.out.println("ENTER THE NAME OF THE STUDENT "+i+" :-");
			String x=Scan.next();
			lis.add(x);
		}
		lis.sort(Collections.reverseOrder());
		System.out.println(lis);
		
	}

}
