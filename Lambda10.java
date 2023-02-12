interface You
{
    void kc();
}
public class Lambda10
{
    public static void main(String... args)
    {
        You y = ()->{
           System.out.println("My name is KC");
        };

        y.kc();

        You yo = new You(){
           public void kc()
            {
                System.out.println("My name is SLC");
            }
        };

        yo.kc();
    }
}