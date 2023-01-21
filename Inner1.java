class A 
{
    B b = new B();
    void kc()
    {
        System.out.println("Hiii ");
        b.slc();
    }

    class B 
    {
        void slc()
        {
            System.out.println("Laxman");
        }
    }
}

class Inner1
{
    public static void main(String [] args)
    {
        A a = new A();
        a.kc();

    }
}