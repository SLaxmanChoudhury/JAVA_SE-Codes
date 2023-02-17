class Subham
{
    void subu(String name)
    {
        System.out.println("Mr Developer");
        System.out.println("Mr GM");

        synchronized(this)
        {
            for(int i =0;i<5;i++)
            {
                System.out.print("My Name is ");
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){}
                    System.out.println(name);

            }
        }
        System.out.println("outside of synchronized block");

    }
}

class SG extends Thread
{
    Subham sbm;
    String name;

    SG(Subham sbm, String name)
    {
        this.sbm = sbm;
        this.name = name;

    }

    public void run()
    {
        sbm.subu(name);
    }


}
public class MT20
{
    public static void main(String... args)
    {
        Subham sbm = new Subham();

        SG sg1 = new SG(sbm, "Subham");
        SG sg2 = new SG(sbm, "Subu");

        sg1.start();
        sg2.start();

        System.out.println("Main Thread");

    }
}