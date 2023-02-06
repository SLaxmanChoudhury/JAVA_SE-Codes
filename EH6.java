import java.util.Scanner;

class Alpha
{
    void alpha()
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
        }
        
    }
}
class Beta
{
    void beta()
    {
        try
        {
             Alpha alf = new Alpha();
        alf.alpha();

        }
        catch(ArithmeticException ei)
        {
            System.out.println("Exception handled in beta method.");
        }
       
    }
}

public class EH6
{
    public static void main(String[] args)
    {
        try
        {
            Beta bt = new Beta();
            bt.beta();
        }
        catch(Exception a)
        {
            System.out.println("You try to devide by the number in zero(0) , Exception handled in main method.");
        }
        System.out.println("Your calculation is complited. ");
      
    }
}













