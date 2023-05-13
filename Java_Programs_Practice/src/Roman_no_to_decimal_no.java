import java.util.*;

public class Roman_no_to_decimal_no {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine();
        int decimal = convertToDecimal(roman);
        System.out.println("Decimal number: " + decimal);
    }

    public static int convertToDecimal(String roman) {
        int decimal = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int curValue = getRomanValue(roman.charAt(i));
            if (curValue < prevValue) {
                decimal -= curValue;
            } else {
                decimal += curValue;
            }
            prevValue = curValue;
        }
        return decimal;
    }

    public static int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
