interface IDemo4
{
    void apj();
}
interface IDemo5
{
    void abul();
}
class DemoImpl6 implements IDemo4 , IDemo5
{
    public void apj()
    {
        System.out.println("This is apj block");
    }
    public void abul()
    {
        System.out.println("This is abul block");
    }
    
}
public class Interface4
{
    public static void main(String[] args)
    {
        DemoImpl6 dm = new DemoImpl6();
        dm.apj();
        dm.abul();
    }
}