class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Priority of child thread is : "+Thread.currentThread().getPriority());
    }
}
public class MT4
{
    public static void main(String... args)
    {
        System.out.println("Priority of child thread is : "+Thread.currentThread().getPriority());
        MyThread mt = new MyThread();
        mt.start();
    }
}