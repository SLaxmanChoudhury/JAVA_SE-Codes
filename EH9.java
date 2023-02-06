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
            e.getMessage();
            e.toString();
            e.printStackTrace();
         
        }
        System.out.println("code is terminated");
      
        
    }
}



public class EH9
{
    public static void main(String[] args)
    { 
        Alpha2 a = new Alpha2();
        a.alpha();

    }
}