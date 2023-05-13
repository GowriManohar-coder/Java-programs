import java.util.*;

public class IntegerToRoman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
   
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String romanNumber=" ";
        
        for (int i = 0; i < symbols.length; i++) {
        	if(num<=0)
        		break;
            while (num >= values[i]) {
            	num=num-values[i];
            	romanNumber = romanNumber+symbols[i]; 
            }
        }
        System.out.println(romanNumber);
    }
}
