class MT11
{
    public static void main(String... args)
    {
        Thread t = new Thread(
            new Runnable(){
                public void run()
                {
                    for(int i = 0; i<5;i++)
                    {
                        System.out.println("Child Thread");
                    }
                }
            }
        );
        t.start();

        for(int j = 0; j<5; j++)
        {
            System.out.println("Main Thread");
        }
    }
}