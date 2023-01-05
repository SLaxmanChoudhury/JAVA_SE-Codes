import java.util.*;
class Supper
{
    int a,b,c;
    Scanner ch = new Scanner(System.in);
    void add()
    {
        System.out.println("Enter two number for Add : ");
        a = ch.nextInt();
        b = ch.nextInt();
        c=a+b;
        System.out.println("The result of add: " + c);

    }
}
class Sub1 extends Supper
{
    void sub()
    {
        System.out.println("Enter two number for Sub : ");
        a = ch.nextInt();
        b = ch.nextInt();
        c=a-b;
        System.out.println("The result of Sub: " + c);

    }
}
class Sub2 extends Sub1
{
    void multi()
    {
        System.out.println("Enter two number for multi : ");
        a = ch.nextInt();
        b = ch.nextInt();
        c=a*b;
        System.out.println("The result of multi: " + c);

    }
}
class Sub3 extends Sub2
{
    void div()
    {
        System.out.println("Enter two number for div : ");
        a = ch.nextInt();
        b = ch.nextInt();
        c=a/b;
        System.out.println("The result of div: " + c);

    }
}
class MultiLInhe
{
    public static void main(String[] args)
    {
        Sub3 sb = new Sub3();
        sb.add(); sb.sub(); sb.multi(); sb.div();
    }
}