public class fibonacci {
    public static void main(String[] args) {
        int num = 10;  // Number of Fibonacci terms to print

        int first = 0, second = 1, temp;

        // Print the Fibonacci series up to N terms
        System.out.print(first + " ");  // Print the first Fibonacci number
        for (int i = 1; i < num; i++) {
            temp = first + second;
            first = second;
            second = temp;
            System.out.print(first + " ");  // Print the next Fibonacci number
        }
    }
}
