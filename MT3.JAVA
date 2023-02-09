class MyRunn implements Runnable
{
   public void run()
    {
        for(int i =0; i<5; i++)
        //System.out.println("MyRun class");
        {


        Thread.currentThread().setName("SLC");
        System.out.println(Thread.currentThread().getName());
        }
    }
    
}
public class MT3
{
    public static void main(String[] args)
    {
        MyRunn mr = new MyRunn();

        Thread t = new Thread(mr);
        t.start();

        for(int j =0;j<5; j++)
        //System.out.println("main Thread");
        {


        Thread.currentThread().setName("KC");
        System.out.println(Thread.currentThread().getName());
        }
    }
}