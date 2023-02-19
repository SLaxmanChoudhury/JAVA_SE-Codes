import java.util.*;
class A
{
    private int password;
    public void setValue(int x)
    {
        password = x;

    }
    public int getValue()
    {
        return password;
    }
}
class Ex4
{
    static int a;
    public static void main(String[] args)
    {
        System.out.print("Enter your password : ");
        Scanner ch = new Scanner(System.in);
        try
        {

        a = ch.nextInt();
        }
        catch(InputMismatchException e)
        {
           System.out.println("Invalid Input. Please enter Int Value.");
        }
        A rec = new A();
        rec.setValue(1234);
        if(a==1234)
        {   System.out.print("User Your password is : ");
            System.out.println( rec.getValue());
            System.out.println("Login Successful!");

        }
        else{
            System.out.println("Invalid Password");
        }

        
    }
}