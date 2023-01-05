interface A
{
    void kc();
    default void slc()
    {
        System.out.println("SLC");
    }
    static void music()
    {
        System.out.println("Music");
    }

}
class B implements A 
{
   public void kc()
    {
        System.out.println("KC");
    }
}
class C implements A 
{
    public void kc()
    {
        System.out.println("kc-1");
    }
    public void slc()
    {
        System.out.println("slc-1");
    }
}
class InterFace
{
    public static void main(String[] args)
    {
        A.music();
        C c = new C();
        c.kc();
        c.slc();
        B b = new B();
        b.kc();
        b.slc();
    }

}