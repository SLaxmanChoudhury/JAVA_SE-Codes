class Displayy
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
    Displayy dp;
    String name;
    public MoThread(Displayy dp, String name)
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
public class MT15
{
    public static void main(String... args)
    {
        Displayy dp = new Displayy();
        MoThread mo1 = new MoThread(dp,"KC");
        MoThread mo2 = new MoThread(dp,"SLC");
         
        mo1.start();
        mo2.start();
        System.out.println("Main Thread");
    }
}
