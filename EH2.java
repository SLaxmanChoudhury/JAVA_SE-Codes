import java.util.Scanner;
class EH2
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        try
        {
             System.out.println("Enter a number for Numerator : ");
             int a = sn.nextInt();
             System.out.println("Enter the 2nd number for Denomenator : ");
             int b = sn.nextInt();
             int result = a/b;
             System.out.println("The Results of devision is : " +result);

        }
        catch(Exception e)
        {
            System.out.println("You try to devide by the number in zero(0) .");
        }
        System.out.println("Your calculation is complited. ");
      
    }
}