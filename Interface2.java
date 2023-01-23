interface IDemo
{
    void service();
    void process();
}
class Demo1Impl implements IDemo
{
    public void service()
    {
        System.out.println("This Srevice is provide.");
    }
    public void process()
    {
        System.out.println("This is process block");
    }
}
class Interface2
{
    public static void main(String[] args)
    {
        Demo1Impl dmp = new Demo1Impl();
        dmp.service();
        dmp.process();
    }
}