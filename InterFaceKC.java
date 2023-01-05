interface A 
{
     void m();
     void m1();
     void m2();
    default void m4()
    {
        System.out.println("KC");
    }
}
class B implements A{


}
class InterFaceKC
{
    public static void main(String[] args)
    {
        A.m();
    }
}