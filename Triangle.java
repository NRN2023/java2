import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = uInput.nextInt();
        System.out.println("enter the value of b :");
        int b = uInput.nextInt();
        System.out.println("enter the value of c : ");
        int c = uInput.nextInt();
        uInput.close();
        if((a+b)>c && (b+c)>a && (c+a)>b){
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("the area is : "+area);
        }
        else{
            System.out.println("triangle is not possible");
        }
    }
}
