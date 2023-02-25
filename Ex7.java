import java.util.Scanner;
//  1+2=12
class Ex7
{
    public static void main(String... args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        String a = sn.nextLine();
        System.out.println("Enter the 2nd Number : ");
        String b = sn.nextLine();
        System.out.println("sum of the two numbers is : " + a.concat(b));
        
    }

}