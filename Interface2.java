interface IDemo
{
    void service();
    void process();
}
class Demo1Impl implements IDemo
{
    @Override
    public void service()
    {
        System.out.println("This Srevice is provide.");
    }
    public void process()
    {
        System.out.println("This is process block");
    }
}
public class Interface2
{
    public static void main(String[] args)
    {
        IDemo demo = new Demo1Impl();
        demo.service();
        demo.process();
    }
}