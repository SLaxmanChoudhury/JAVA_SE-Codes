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
class Ex6
{
    public static void main(String[] args)
    {
        System.out.print("Enter your password : ");
        Scanner ch = new Scanner(System.in);
        int a = ch.nextInt();
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