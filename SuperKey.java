class A{
    void show()
    {
        System.out.println("KC");
    }
}
class B extends A{
    void show()
    {
        super.show();
        System.out.println("SLC");
    }

}
class SuperKey
{
    public static void main(String[] args)
    {
        B res = new B();
        res.show();
    }
}

