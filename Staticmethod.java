class Test
{
    static{
        System.out.print("Happy");
    }
    void Test2()
    {
        System.out.print("Year-2023");
    }
}
class Staticmethod
{
    static void Test3()
    {
        System.out.print(" New ");
    }
    public static void main(String[] args)
    {
        Test ts = new Test();
        Test3();
        ts.Test2();



    }
}