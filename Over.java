class A
{
    void m1()
    {
        System.out.println("Hi");
    }
}
class B extends A 
{
    @Override
    void m1()
    {
        System.out.println("Hello");
    }
}
class Over
{
    public static void main(String[] args)
    {
         B b = new B();
         b.m1();
    }
}
