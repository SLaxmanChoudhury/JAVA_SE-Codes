class H 
{

   private int a =10;
   static void hello()
   {
        //g.hii();
        System.out.println("Hello");
   }
   G g = new G();

    class G 
    {
        void hii()
        {
            System.out.println("Inner Class" +a);
            hello();

        }
    }
}
class Inner4
 {
    public static void main(String[] args)
    {
        H h = new H();
        h.g.hii();
    }
}