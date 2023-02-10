import java.sql.*;

class MyThread extends Thread
{

    public void run()
    {
      
      
        try
        {
           for(int i = 0; i < 5; i++){
            System.out.println("This is Child thread...");
            Thread.sleep(2000);
           }
        }
        catch(InterruptedException e)
        {
            System.out.println("OOPSSS  i got interrupted...");
        }
    }
}
public class MT8
{
    public static void main(String... args)throws InterruptedException
    {
  
        MyThread mt = new MyThread();

        mt.start();

        mt.interrupt();

        System.out.println("Main Thread");
    }
}