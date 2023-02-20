class Display1
{
    void dis(String name)
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println("My name is "+ name + "............................");
        synchronized(this)
        {
            for(int i = 0; i<5; i++)
            {
                System.out.println(name+"'s age is 21.");
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e)
                {

                }
            }
        }
    }
}

class Exx extends Thread
{
    Display1 d1;
    String name;
    Exx(Display1 d1,String name)
    {
        this.d1 = d1;
        this.name = name;
    }
    public void run()
    {
        d1.dis(name);
    }
}

class MT22
{
    public static void main(String... args)
    {
        Display1 d1 = new Display1();
        Display1 d2 = new Display1();

        Exx e1 = new Exx(d1, "Laxman");
        Exx e2 = new Exx(d2, "Kalia");

        e1.start();
        e2.start();

        System.out.println("Main Thread");
    }
}