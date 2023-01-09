class Demo
{
    void youtube()
    {
        System.out.println("Youtube.");
    }
}
class Demo1 extends Demo
{
    void youtube()
    {
        System.out.println("I am waching youtube.");
    }
}
class Demo2 extends Demo
{
    void youtube()
    {
        System.out.println("I am not waching youtube.");
    }
}
class PolyWay
{
    public static void main(String[] args)
    {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo d5 = new Demo2();
        d5.youtube();
        Demo d;
        d = d1;
        d.youtube();
        d = d2;
        d.youtube();
    }
}