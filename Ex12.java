class MynThread extends Thread
{
    public void run()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("New Thread");
            //Thread.yield();
        }
    }
}

public class Ex12
{
    public static void main(String[] args)
    {
        MynThread myn = new MynThread();
        myn.start();

        for(int i = 0; i<5; i++)
        {
            System.out.println("Main Thread");
            Thread.yield();
        }
        
    }
}