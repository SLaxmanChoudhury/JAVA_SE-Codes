abstract class Computer
{
   void chip()
    {
        System.out.println("HDD");
    }
}
class MethodOver1
{
    public static void main(String[] a)
    {
        Computer com = new Computer() //anonymous inner class
        {
            void chip()
            {
                System.out.println("OverRide HDD");
            }
        };
        com.chip();
    }
}