import java.util.*;
public class Trangle
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner t =new Scanner(System.in);
        System.out.println("Please Enter the length of 3 side of a trangle :  ");
        a= t.nextInt();
        b= t.nextInt();
        c=t.nextInt();
        if(a<b+c || c<a+b || b<a+c)
        {
            System.out.println("This is a valid Trangle.");
        }
        else{
            System.out.println("This is a invalid Trangle.");
        }
    }
}