class Display
{
    public void show(String name)
    {
        for(int i=0;i<5;i++){
        System.out.println("Good Morning "+ name);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {

        }
        }
    }
}
class MoThread extends Thread
{
    Display dp;
    String name;
    public MoThread(Display dp, String name)
    {
        this.dp = dp;
        this.name = name;
    }

    @Override    
    public void run()
    {
        dp.show(name);
    }
}
public class MT14
{
    public static void main(String... args)
    {
        Display dp = new Display();
        MoThread mo = new MoThread(dp,"KC");
         
        mo.start();
        System.out.println("Main Thread");
    }
}
