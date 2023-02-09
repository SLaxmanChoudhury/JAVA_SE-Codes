import java.sql.*;

class MyThread extends Thread
{
    public void run()
    {
        for(int i =0 ; i<5; i++)
        {
       // Thread.yield();
        System.out.println("child Thread");

        }
    }
}
public class MT5
{
    public static void main(String... args)
    {
        
        MyThread mt = new MyThread();

        mt.start();
         for(int i = 0; i<5; i++)
        {

        System.out.println("Main Thread");

        }
    }
}