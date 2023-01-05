import java.util.*;
import java.lang.*;
public class Gcd
{
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter two Number : ");
        int a = c.nextInt();
        int b = c.nextInt();
        for( int i = 0;i>=0;i++)
        {
    
            if(a % i == 0 || b % i == 0)
            {
                System.out.print(i);

            }
         
            // else
            // {
            //     System.out.print("jjjj");
            // }
        }
    }
}