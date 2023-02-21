class NewThread extends Thread
{
    int total =0;
    @Override
    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child thread start the calculation");//step-2
            for(int i=0;i<=100 ; i++)
            {
                total+=i;
            }
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ee)
            {

            }
           
            System.out.println("Child thread giving notification call");//step-3
            this.notify();

        }
    }
}
public class Ex5
{
    public static void main(String[] args)throws InterruptedException 
    {
        NewThread b=new NewThread();
        b.start();
        

        synchronized(b)
        {
            System.out.println("Main thread calling wait() method");//step-1
            b.wait();
            System.out.println("Main thread got notification call");//step-4
            System.out.println(b.total);
        }
    }
}
