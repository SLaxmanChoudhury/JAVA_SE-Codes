import java.util.*;
class A
{
    MthObj mtd = new MthObj();
    void input()
    {
        
        Scanner src = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        mtd.a = src.nextInt();
        mtd.b = src.nextInt();

    }
    void Process()
    {
      
        mtd.sum = mtd.a + mtd.b;
        mtd.sub = mtd.a - mtd.b;
    }
    void output()
    { 
      
        System.out.println("Sum is : " + mtd.sum);
        System.out.println("Sub is : " + mtd.sub);
        
    }

}

public class MthObj
{
    public int a,b,sum,sub;
   
    public static void main(String [] args)
    {
 
        A obj = new A();
        obj.input();
        obj.Process();
        obj.output();


    }
}