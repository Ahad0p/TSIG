public class ex2 {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        int num=12345;
        num=Math.abs(num);
        while (num>0) {
            int digit=num%10;
            if (digit%2==0) {
                even++;
            }
            else{
                odd++;
            }
            num/=10;
        }
        System.out.println("even digits are :"+even);
        System.out.println("odd digits are :"+odd);
    }
}
