import java.util.*;

class Add{
    
    public void add(int num1, int num2)
    {
        int m = num1+num2;
        System.out.println("Result is "+ m);
    }
    public void sub(int num1, int num2)
    {
        int k = num1-num2;
        System.out.println("Sub Result is : " + k);
    }
}

public class Rev2
{
    public static void main(String[] args)
    { Scanner c = new Scanner(System.in);
        System.out.println("Enter two Number : ");
        int a= c.nextInt();
        int b= c.nextInt();


        Add ad = new Add();
        ad.add(a, b);
        ad.sub(a, b);
    }
}