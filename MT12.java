public class MT12
{
    public static void main(String... args)
    {
 
       new Thread(()->{    ////Lmbda Expression
            for(int i=0; i<5; i++)
            {
                System.out.println("Lambde Thread");
            }
        }
        ).start();
   

        System.out.println("Main Thread");
    }
}