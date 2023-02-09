class MyRun implements Runnable
{
   public void run()
    {
        for(int i =0; i<5; i++)
        System.out.println("MyRun class");
    }
    
}
public class MT2Runnable
{
    public static void main(String[] args)
    {
        MyRun mr = new MyRun();

        Thread t = new Thread(mr);
        t.start();

        for(int j =0;j<5; j++)
        System.out.println("main Thread");
    }
}