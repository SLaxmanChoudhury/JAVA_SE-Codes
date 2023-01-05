import java.util.*;
public class Power
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner c= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        a = c.nextInt();
        int y=a;
        System.out.print("Enter the Power of this Number :");
        b= c.nextInt();

        int n = b;
        for(int m=0; m<b; m++)
        {
            a = a*y;
        }

        System.out.print("The Result of " + y + "^" + n + " is : " +a);
    }
}