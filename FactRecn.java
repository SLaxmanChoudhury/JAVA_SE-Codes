import java.util.*;
class FactRecn
{
    public static void main(String[] args)
    {
        Scanner ch = new Scanner(System.in);
        System.out.print("Enter a number you want to find factorial : ");
        int n = ch.nextInt();
        FactRecn fr = new FactRecn();
        int m = fr.fact(n);
        System.out.println("The Result is : " + m );

    }
    int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }

    }
}