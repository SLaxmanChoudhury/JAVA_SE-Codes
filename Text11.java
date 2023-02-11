interface Demo11
{
    void demo11();
    void kcc();
}
class Demo12 implements Demo11
{
   public void demo11()
    {

    }
    public void kcc()
    {

    }

}
class Demo13 extends Demo12
{
    public void demo11()
     {
        System.out.println("Panda");
     }
}
class Demo14 extends Demo13
{
   public void kcc()
    {
        System.out.println("Subham");
    }
}

public class Text11
{
    public static void main(String... args)
    {
        Demo14 d14 = new Demo14();
        d14.demo11();
        d14.kcc();
    }
}