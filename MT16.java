class YouTube
{
    public synchronized void youtube(String name)
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("My YouTube Channel name is " + name);
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
class Mothread extends Thread
{
    String name;
    YouTube yt;
    public Mothread(YouTube yt , String name)
    {
        this.yt = yt;
        this.name = name;
    }
    public void run()
    {
        yt.youtube(name);
    }
}

public class MT16
{
    public static void main(String... args)
    {
        YouTube yt = new YouTube();
        Mothread mo1 = new Mothread(yt, "SLC");
        Mothread mo2 = new Mothread(yt, "KC");

        mo1.start();
        mo2.start();

        System.out.println("Main Thread");
    }
}