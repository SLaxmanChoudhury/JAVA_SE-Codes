abstract class Program
{
    abstract void devloper();
    abstract void devl();
    abstract void rank();
}

class Java extends Program
{
    @Override
    public void devl()
    {
        System.out.println("Jems Gosling");
    }

   
    public void devloper()
    {
        System.out.println("Tim Berners Lee");
    }
    @Override
    public void rank()
    {
        System.out.println("3rd");
    }
   
}

class HTML extends Program
{
    @Override
    public void devl()
    {
        System.out.println("Jems Gosling");
    }

   
    public void devloper()
    {
        System.out.println("Tim Berners Lee");
    }
    @Override
    public void rank()
    {
        System.out.println("3rd");
    }
   
}
class AbstractM
{
    public static void main(String[] args)
    {
        Program p = new Java();
        Program p1 = new HTML();
        p.devloper();
        p.rank();
        p.devl();
        p1.devloper();
        p1.rank();
        p1.devl();
    }
}