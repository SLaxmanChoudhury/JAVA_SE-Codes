import java.util.Scanner;

class Alpha
{
    void alpha()
    {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter a number for Numerator : ");
        int a = sn.nextInt();
        System.out.println("Enter the 2nd number for Denomenator : ");
        int b = sn.nextInt();
        int result = a/b;
        System.out.println("The Results of devision is : " +result);

    }
}
class Beta
{
    void beta()
    {
        Alpha alf = new Alpha();
        alf.alpha();
    }
}

public class EH4
{
    public static void main(String[] args)
    {
        try
        {
            Beta bt = new Beta();
            bt.beta();
        }
        catch(ArithmeticException e)
        {
            System.out.println("You try to devide by the number in zero(0) .");
        }
        System.out.println("Your calculation is complited. ");
      
    }
}













