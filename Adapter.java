interface IDemo9
{
    void slc();
    void kc();
}
abstract class AdapterImpl implements IDemo9
{
    public void slc(){}
    public void kc(){}
}
class Result extends AdapterImpl
{
   public void slc()
   {
    System.out.println("My name is SLC :)");
   }
}
public class Adapter
{
    public static void main(String [] args)
    {
        IDemo9 rl = new Result();
        rl.slc();
    }
}
