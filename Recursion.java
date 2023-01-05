
import java.util.*;
public class Recursion
{
    public static void main(String[] args)
    {
        Scanner ch= new Scanner(System.in);
        System.out.print("Enter a number till you want to sum : ");
        int b = ch.nextInt();
        Recursion r = new Recursion();
         int a = r.sum(b);
        System.out.print("Sum of total N number is : " + a );
        
    
    }
    int sum(int b)
    {
        if(b>0)
        {
            return b+sum(b-1);
        }
        else
        {
            return 0;
        }
    }
}