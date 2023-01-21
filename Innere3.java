class H 
{

   G g = new G();

    class G 
    {
        void hii()
        {
            System.out.println("Inner Class");
        }
    }
}
class Innere3
 {
    public static void main(String[] args)
    {
        H h = new H();
        h.g.hii();
    }
}