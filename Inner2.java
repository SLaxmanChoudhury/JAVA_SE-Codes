class C
{
   // D d = new D();
   static void kc()
    {
        System.out.println("Hiii ");
        D.slc();
    }

    static class D 
    {
        static void slc()
        {
            System.out.println("Laxman");
        }
    }
}

class Inner2
{
    public static void main(String [] args)
    {
        // C c = new C();
        // c.kc();
        C.kc();
        C.D.slc();

    }
}