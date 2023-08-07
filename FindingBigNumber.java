import java.util.Scanner;
public class FindingBigNumber{
    public static void main(String[] args)
    {
        Scanner uInput = new Scanner (System.in);
        System.out.print("enter the first number : ");
        int first = uInput.nextInt();
        System.out.print("enter the second number : ");
        int second = uInput.nextInt();
        System.out.print("enter the third number : ");
        int third = uInput.nextInt();
        uInput.close();
        if(first > second && first > third)
        {
            System.out.print("first number is big number");
        }
        else if(second > first && second > third)
        {
            System.out.print("second number is big");
        }
        else
        {
            System.out.print("third number is big");
        }
    }
}