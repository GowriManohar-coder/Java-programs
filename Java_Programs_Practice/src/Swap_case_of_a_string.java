import java.util.Scanner;

class Swap_case_of_a_string{
	
  public static void main(String args[]){
      Scanner Scan = new Scanner(System.in);
	  System.out.println("Enter the sentence:-");
	  String sent=Scan.nextLine();
	  int n;
	  for(int i=0;i<sent.length();i++){
	      int ch=sent.charAt(i);
	      if(ch>64&&ch<91)
	      n=ch+32;
	      else
	      n=ch-32;
	      char j=(char)n;
	      System.out.print(j);
	  }
  }
}