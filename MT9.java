public class MT9
{
    public static void main(String... args)
    {
        Runnable r = ()->{    ////Lmbda Expression
            for(int i=0; i<5; i++)
            {
                System.out.println("Lambde Thread");
            }
        };
        Thread t = new Thread(r);
        t.start();

        System.out.println("Main Thread");
    }
}