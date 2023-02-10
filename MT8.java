import java.sql.*;

class MyThread extends Thread
{
    static Thread t;
    public void run()
    {
        for(int i =0 ; i<5; i++)
        {
     
        System.out.println("child Thread");
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
public class MT8
{
    public static void main(String... args)throws InterruptedException
    {
        MyThread.t = Thread.currentThread();
        MyThread mt = new MyThread();

        mt.start();
       // mt.join(1000);
       mt.interrupted();
        for(int i = 0; i<5; i++)
        {
         
           System.out.println("Main Thread");

        }
    }
}