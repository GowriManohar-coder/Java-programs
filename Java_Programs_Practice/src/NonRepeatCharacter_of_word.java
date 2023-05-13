import java.util.*;
public class NonRepeatCharacter_of_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		ArrayList<String> lis = new ArrayList<>(); 
		var sum=0;
		for(var i=1;i<=3;i++) {
			System.out.println("ENTER THE NAME"+i+" :-");
			var x=Scan.next();
			lis.add(x);
			
		} 
		for(var i=0;i<lis.size();i++) {
			var h=lis.get(i);
			for(var j=0;j<h.length();j++) {
				var x=h.charAt(j);
				var count=0;
				for(var k=j+1;k<h.length();k++){
					if(x==h.charAt(k))
						count++;
				}
				if(count==0) {
					System.out.println("The non repetative character in "+h+" is "+x);
					break;
				}
				}
				}

	}

}