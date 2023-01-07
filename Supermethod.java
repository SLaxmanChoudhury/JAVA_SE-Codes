class Test1
{
    Test1()
    {
        System.out.println("Super Class");

    }
}
class Test2 extends Test1
{
    Test2()
    {
        this(9);
        System.out.println("Constructor-1");
    }
    
    {
        System.out.println("Instance Block");
    }

    Test2(int a)
    {
        System.out.println("Constructor-2");
    }

}
class Supermethod
{
    public static void main(String[] args)
    {
       
        Test2 t2 = new Test2();
         
     
    }
}