@FunctionalInterface
interface Demo4
{
    void hello();
}
 public class Lamb1
 {
    public static void main(String[] args)
    {
        Demo4 d4 = ()-> System.out.println("Hello Java Lovers");
        d4.hello();
    }
 }