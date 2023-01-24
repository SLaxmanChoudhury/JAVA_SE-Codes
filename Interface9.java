interface If1
{
    void kc();
}
interface If2
{
    void kc();
}
class If3Impl implements If1, If2
{
    public void kc()
    {
        System.out.println("This is KC block");
    }
}
public class Interface9
{
    public static void main(String[] args)
    {
        If3Impl if3 = new If3Impl();
        if3.kc();
    }

}