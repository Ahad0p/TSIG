import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows = scn.nextInt();
        //creating a pyraming with n number of rows
       for (int i = 0; i < rows; i++) {
            // Printing spaces before the stars
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Printing stars, using j <= i
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <rows-1; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows-i-1; j++) {

                System.out.print("* ");
            }
            System.out.println();
            
        }

    }
}
