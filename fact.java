public class fact {
    public static void main(String[] args) {
        int num =4;
        int fact=1;
        for (int i =1;i<=num;i++){
            fact*=i;
        }
        System.out.println("factorial of the given number "+num+" is: "+fact);
    }
}