import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.print("enter the range of your series : ");
        int n = uInput.nextInt();
        uInput.close();
        int first = 0, second = 1;
        System.out.println("the fibonacci series is : ");
        for(int i = 0; i <= n; i++){
            int fibo = first + second;
            first = second;
            second = fibo;
            System.out.println(fibo);
        }
    }
}
