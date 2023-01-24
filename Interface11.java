interface If12
{
    void kc();
}
interface If22
{
    int kc(int a);
}
class If32Impl implements If12, If22
{
    public void kc()
    {
        System.out.println("This is KC block");
    }
    public int kc(int a)
    {
        System.out.println("This is KC-1 block");
        return a;
    }
}
public class Interface11
{
    public static void main(String[] args)
    {
        If32Impl if31 = new If32Impl();
        if31.kc();

        int m = if31.kc(10);
        System.out.println(m);

    }

}