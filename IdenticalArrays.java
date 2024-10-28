import java.util.Scanner; // imports scanner for user input

public class IdenticalArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // define the arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        
        // user enters values for array 1
        System.out.println("Enter a list of 9 numbers for list 1, then press Enter. ");
        // loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	// store user input 
                m1[i][j] = input.nextInt(); 
            }
        }
        // user enters values for array 2
        System.out.println("Enter the second identical list of 9 numbers, then press Enter: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        // verify that arrays are identical or not
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical. Try again.");
        }

        input.close();
    }

    // return true if m1 and m2 are identical 
    public static boolean equals(int[][] m1, int[][] m2) {
        // check if elements in the arrays are equal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;  // return false if any elements do not match
                }
            }
        }
        return true;  // return true if all elements match
    }
}
