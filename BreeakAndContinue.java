import java.util.Scanner;

public class BreeakAndContinue {
    public static void main(String[] args) {
        loop1:
        for(;;){
        Scanner uInput = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = uInput.nextInt(), b = uInput.nextInt();
        uInput.close();
        if(a<=0 || b<=0){
            System.out.println("wrong input enter again");
            continue loop1;
        }
        else{
            int c = a+b;
            System.out.println("The summation is : "+c);
            break loop1;
        }
        }

    }
}
