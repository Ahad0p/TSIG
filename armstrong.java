public class armstrong {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 1000 and check each one
        for (int num = 1; num < 1000; num++) {
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int digits = 0, temp;
        int sum = 0;
        temp = n;

        // Find the number of digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;

        // Calculate the sum of each digit raised to the power of 'digits'
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits); 
            temp = temp / 10;
        }

        // Return true if the sum equals the original number
        return sum == n;
    }
}
