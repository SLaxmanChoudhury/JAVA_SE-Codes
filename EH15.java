class Jj
{
    void kc()throws Exception
    {

    }
}
class Jjj extends Jj
{
    public void kc()throws ClassNotFoundException
    {
      int a= 10/0;
    }
}
public class EH15
{
    public static void main(String... args)
    {
        Jjj j = new Jjj();
        try{

        j.kc();
        }
        catch(Exception ee)
        {
            System.out.println("Hello");
        }
    }
}