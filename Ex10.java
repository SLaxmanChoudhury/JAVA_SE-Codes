class M implements Runnable
{
    public void run()
    {
        for(int i =0; i<5; i++)
        {
            System.out.println("Run Thread");
        }
    }
}
public class Ex10
{
    public static void main(String[] args)
    {
        M m = new M();
        Thread t = new Thread(m);
        t.start();
        System.out.println("Main Thread");
    }
}