import java.util.Scanner;

public class dighat {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a, b, c;
        double d, x, x1, x2;
        Scanner uInput = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        a = uInput.nextInt();
        System.out.println("enter the value of b : ");
        b = uInput.nextInt();
        System.out.println("enter the value of c : ");
        c = uInput.nextInt();
        uInput.close();
        d = b*b-4*a*c;
        if(d>0){
            x1 = -b+Math.sqrt(d)/2*a;
            x2 = -b-Math.sqrt(d)/2*a;
            System.out.println("roots are "+x1+x2);
        }
        else if (d==0){
            x = -b/2*a;
            System.out.println("root is : "+x);
        }
        else{
            System.out.println("roots are not real");
        }


    }    
}
