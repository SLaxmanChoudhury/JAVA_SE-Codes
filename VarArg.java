class Dm1
{
    void add(int... x)
    {

        System.out.println("Var-Arg Approach");
        
    }
}
class VarArg
{
    public static void main(String[] args)
    {
        Dm1 d1 = new Dm1();
        d1.add(10);
        d1.add(10,20);
    }
}