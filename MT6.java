import java.sql.*;

class MyThread extends Thread
{
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
public class MT6
{
    public static void main(String... args)throws InterruptedException
    {
        
        MyThread mt = new MyThread();

        mt.start();
        mt.join(1000);
        for(int i = 0; i<5; i++)
        {

           System.out.println("Main Thread");

        }
    }
}