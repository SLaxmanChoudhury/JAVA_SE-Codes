import java.util.Scanner;
class EH3
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        try
        {
            System.out.println("Enter the 1st number for deveding :");
            int a = sn.nextInt();
            System.out.println("Enter the 2nd number for deviding :");
            int b = sn.nextInt();
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("You try to devied 1st number with zero(0). ");
        }
        try
        {
            System.out.println("Enter the 1st number for addation :");
            int e = sn.nextInt();
            System.out.println("Enter the 2nd number for addition :");
            int f = sn.nextInt();
            int g = e+f;
            System.out.println("Result is : "+g);
        }
        catch(Exception h)
        {
            System.out.println("Not Exception");
        }
        System.out.println("Programe is complet :)");
       
    }
}