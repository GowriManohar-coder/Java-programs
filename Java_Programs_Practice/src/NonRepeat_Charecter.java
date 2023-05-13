import java.util.Scanner;
public class NonRepeat_Charecter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the word");
		String str = scan.nextLine();
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					count++;	
			}
			if(count==0) {
				System.out.println(str.charAt(i)+" is non reapt word");
				break;
			
			}
			
		}
		
		

	}

}
