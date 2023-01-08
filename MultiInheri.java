class A1
{
    void Slc()
    {
        System.out.println("Class-A1");
    }
}
class A2 extends A1{
    void KC()
    {
        System.out.println("Class-A2");
    }
}
class A3 extends A2{
    {
        System.out.println("Code for Multiple Inheritance.");
    }

}
class MultiInheri
{
    public static void main(String[] args)
    {
        A3 a3 = new A3();
        a3.Slc();
        a3.KC();
    }
}