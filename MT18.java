class YouTube
{
    public synchronized void youtube1(String name)
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("My 1st YouTube Channel name is " + name);
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {

            }

        }

    }
     public synchronized void youtube2(String name)
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("My 2nd YouTube Channel name is " + name);
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ee)
            {

            }

        }

    }

    public void youtube3()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("No Youtube Channel");

            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException eee)
            {

            }
        }
    }
}
class Mothread1 extends Thread
{
    String name;
    YouTube yt;
    public Mothread1(YouTube yt , String name)
    {
        this.yt = yt;
        this.name = name;
    }
    public void run()
    {
        yt.youtube1(name);
    
    }
}
class Mothread2 extends Thread
{
    String name;
    YouTube yt;
    public Mothread2(YouTube yt , String name)
    {
        this.yt = yt;
        this.name = name;
    }
    public void run()
    {
        yt.youtube2(name);
    
    }
}
class Mothread3 extends Thread
{
 
    YouTube yt;
    public Mothread3(YouTube yt)
    {
        this.yt = yt;
     
    }
    public void run()
    {
        yt.youtube3();
    
    }
}

public class MT18
{
    public static void main(String... args)
    {
        YouTube yt = new YouTube();
        Mothread1 mo1 = new Mothread1(yt, "SLC");
        Mothread2 mo2 = new Mothread2(yt, "KC");
        Mothread3 mo3 = new Mothread3(yt);

        mo1.start();
        mo2.start();
        mo3.start();

        System.out.println("Main Thread");
    }
}