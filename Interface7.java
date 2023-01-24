interface Ikc1
{
    void kc1();
}
class Ikc2
{
    void kc2()
    {
        System.out.println("KC3");
    }
}

class KcImpl extends Ikc2 implements Ikc1
{
    public void kc1()
    {
        System.out.println("KC1");
    }
    public void kc2()
    {
        System.out.println("KC2");
    }
   
}
public class Interface7
{
    public static void main(String[] args)
    {
        KcImpl kcm = new KcImpl();
        kcm.kc1();
        kcm.kc2();
       
    }
}