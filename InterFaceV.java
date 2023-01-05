interface A 
{
    default void call()
    {
        add(10,20);
    }
    private void add(int x, int y)
    {
        System.out.println("Sum is "+ (x + y));
    }
}
class B implements A 
{
    public void sub(int x, int y)
    {
        System.out.println("Sub is "+ (x - y));

    }
}
class InterFaceV
{
    public static void main(String[] args)
    {
        B b = new B();
        b.call();
        b.sub(100,20);
    }
}