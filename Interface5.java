interface ITemp1
{
    void text1();
}
interface ITemp2 extends ITemp1
{
    void text2();

}

class Temp4Impl implements ITemp2
{
    public void text1()
    {
        System.out.println("This is text1 block");
    }
    public void text2()
    {
        System.out.println("This is text2 block");
    }
}
public class Interface5
{
    public static void main(String [] args)
    {
        Temp4Impl tm4 = new Temp4Impl();
        tm4.text1();
        tm4.text2();
    }
}