import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.print("enter any number : ");
        int number = uInput.nextInt(); // Change this value to calculate the factorial for a different number
        uInput.close();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        } 
    }
}

