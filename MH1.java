class Parent
{
    public static void method1()  //static method do participate
    {
        System.out.println("This is Method1 block.");
    }
}
class Child extends Parent
{
    public static void method1()
    {
        System.out.println("This is Method1 child block.");
    }
    public void method2()
    {
        System.out.println("This is method2 block.");
    }
}
public class MH1 
{
    public static void main(String[] args)
    {
        Parent pt = new Child();
        pt.method1();
       // pt.method2(); You can't call specialized method.
    }
}