class A
{
    int a = 2;
    A(int a)
    {
        this.a = a;
    }

    void show()
    {
        System.out.println(a);
    }
    
}
class Ex9
{
    public static void main(String... args)
    {
        A aa = new A(10);
        aa.show();
    }
}