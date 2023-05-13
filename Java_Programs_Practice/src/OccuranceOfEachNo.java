import java.util.*;
public class OccuranceOfEachNo {

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
		}
		for(var i=0;i<lis.size();i++) {
			var h=lis.get(i);
			var count=0;
			for(var j=i+1;j<lis.size();j++) {
				if(h==lis.get(j))
					count++;
			}
			System.out.println("the no "+lis.get(i)+" repeated "+count+" times");
		}
	}

}
