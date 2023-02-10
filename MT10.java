public class MT10
{
    public static void main(String... args)
    {
        Runnable rn = new Runnable(){

            public void run()
            {
                for(int i=0; i<5; i++)
                {
                    System.out.println("Anonymous Thread");
                }
            }
        };
        Thread td = new Thread(rn);
        td.start();

        System.out.println("Main Thtead");
    }
}