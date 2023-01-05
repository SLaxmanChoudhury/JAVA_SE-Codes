import java.util.*;
class Ascii
{
    public static void main(String[] args)
    {
        char ch;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter a char :");
        ch=c.next().charAt(0);
        int a=ch;
        System.out.println("ASCII value of" +ch+" is " +a);


    }
}