import java.io.*;
class Conc
{
    public static void main(String[] args)
    {
        Console obj = System.console();
        System.out.print("Enter Username : ");
        String str = obj.readLine();
        System.out.print("Enter Password : ");
        char ch[] = obj.readPassword();
        String a = String.valueOf(ch);
        System.out.println("Your Username is : " + str);
        System.out.println("Your Password is : " + a);
    
    }
}