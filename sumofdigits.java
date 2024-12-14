public class sumofdigits {
    public static void main(String[] args) {
        int digit =12345;int sum=0;
        while (digit>0) {
            int rem = digit%10;
            sum=sum+rem;
            digit/=10;

        }
        System.out.println("sum of the digits is:"+sum);
    }
}
