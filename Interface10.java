interface If11
{
    void kc();
}
interface If21
{
    void kc(int a);
}
class If31Impl implements If11, If21
{
    public void kc()
    {
        System.out.println("This is KC block");
    }
    public void kc(int a)
    {
        System.out.println("This is KC-1 block");
    }
}
public class Interface10
{
    public static void main(String[] args)
    {
        If31Impl if31 = new If31Impl();
        if31.kc();
        if31.kc(10);

    }

}