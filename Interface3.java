interface IDemo
{
    void service();
    void process();
}
abstract class Demo1Impl implements IDemo
{
    @Override
    public void service()
    {
        System.out.println("This is Srevice block.");
    }
    public abstract void process();
   
}
class Demo1Imp2 extends Demo1Impl
{
    public void process()
    {
        System.out.println("This is process block");

    }

}
public class Interface3
{
    public static void main(String[] args)
    {
        IDemo demo = new Demo1Imp2();
        demo.service();
        demo.process();
    }
}