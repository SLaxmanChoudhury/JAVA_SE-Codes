import java.util.Scanner;
public class Swap
{
    public static void main(String[] args)
    {
        char a,b,c;
        System.out.println("Enter the two char :");
        Scanner r= new Scanner(System.in);
       a= r.next().charAt(0);
       b =r.next().charAt(0);
       System.out.println("Before Swaping :" +a+" "+b);
       c=a;
       a=b;
       b=c;
       System.out.println("After Swaping :" +a+ " "+b);
    }
}