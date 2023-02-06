
import java.util.Scanner;

class Alpha2
{
    void alpha() throws ArithmeticException
    {
        try
        {
            Scanner sn = new Scanner(System.in);

        System.out.println("Enter a number for Numerator : ");
        int a = sn.nextInt();
        System.out.println("Enter the 2nd number for Denomenator : ");
        int b = sn.nextInt();
        int result = a/b;
        System.out.println("The Results of devision is : " +result);


        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception handled in alpha method.");
            throw e;
        }
        finally
        {
            System.out.println("Coden is terminated, this is Finally block");
        }
        
    }
}

public class EH8
{
    public static void main(String[] args)
    {
        try
        {
            Alpha2 bt = new Alpha2();
            bt.alpha();
        }
        catch(Exception a)
        {
            System.out.println("You try to devide by the number in zero(0) , Exception handled in main method.");
        }
        System.out.println("Your calculation is complited. ");
      
    }
}













