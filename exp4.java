import java.util.Arrays;

public class exp4 {
    public static void main(String[] args) {
        int[] num={1,2,55,23,11,22,78,45};
        Arrays.sort(num);
        int min=num[0];
        int max =num[num.length-1];
        System.out.println("max number is :"+max);
        System.out.println("min number is :"+min);

    }
}
