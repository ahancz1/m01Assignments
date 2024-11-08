import java.util.Scanner;


public class CreditValidation {
    
        public static void main(String[] args) {
            // creates scanner object
    Scanner input = new Scanner(System.in);
    System.out.println("Enter credit card number: ");
    // reads the user input
    long number = input.nextLong();
    // call isValid method to check validity 
    if (isValid(number)) {
        System.out.println(number + " is valid.");
    } else {
        System.out.println(number + " is invalid.");
    }
    input.close();
    }
        
        public static boolean isValid(long number) {
            int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
            // checks if result is divisible by 10 
            return totalSum % 10 == 0;
        }
        
        public static int sumOfDoubleEvenPlace(long number) {
            int sum = 0; 
            // convert number to string 
            String numStr = Long.toString(number);
            // starts second to last, loop every second num right to left
            for (int i = numStr.length() - 2; i >= 0; i -= 2) {
                // get character, converts character and stores integer 
                int digit = Character.getNumericValue(numStr.charAt(i));
                // doubles digit and adds to sum
                sum += getDigit(digit * 2); 
            }
            return sum;
        }

        // method to get single-digit from 2 digit number
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }
    
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        // convert to string
        String numStr = Long.toString(number);
        // starts at end, loops through odd right to left, adding every other digit
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += digit;
        }
        return sum;
    }
    
    public static boolean prefixMatched(long number, int d) {
            // get length of d to know the prefix needed
            int prefixLength = Integer.toString(d).length();
            // check prefix matches d            
            return getPrefix(number, prefixLength) == d;
    }
    
    // check length of credit card number
    public static int getSize(long d) {
        // converts number to String and return length (number of digits) 
        return Long.toString(d).length();
    }
    
    // returns first "k" digits, use in prefixMatched
    public static long getPrefix(long number, int k) {
        // convert to string
        String numStr;
            numStr = Long.toString(number);
        // if number less digits than k, return as is
        if (numStr.length() <= k) {
            return number;
        } else {
            
        }
        // get first k numbers, convert to long
        return Long.parseLong(numStr.substring(0, k));
    }
    
}
