class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1; i<5; i++)
        System.out.println("Child Thread");
    }
}
class MT1
{
    public static void main(String[] args)
    {
        MyThread mtb = new MyThread();
        mtb.run();

        for(int j = 1; j<5; j++)
        System.out.println("Main Thread");
    }
}