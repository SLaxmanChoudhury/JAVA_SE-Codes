interface Ikc1
{
    void kc1();
}
interface Ikc2
{
    void kc3();
}
interface Ikc3
{
    void kc3();
}
interface Ikc4 extends Ikc1,Ikc2,Ikc3
{
     void kc4();


}
class KcImpl implements Ikc4
{
    public void kc1()
    {
        System.out.println("KC1");
    }
    public void kc2()
    {
        System.out.println("KC2");
    }
    public void kc3()
    {
        System.out.println("KC3");
    }
    public void kc4()
    {
        System.out.println("KC4");
    }
}
public class Interface6
{
    public static void main(String[] args)
    {
        KcImpl kcm = new KcImpl();
        kcm.kc1();
        kcm.kc2();
        kcm.kc3();
        kcm.kc4();
    }
}