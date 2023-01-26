class Dm2
{
    void add(int... x)
    {
        int count = 0;
        // for(int a:x)
        // {
        //     count += a;
        // }
        for(int i =0; i<x.length; i++)
        {
            count =+ x[i];
        }

        System.out.println(count);
        
    }
}
class VarArg1
{
    public static void main(String[] args)
    {
        Dm2 d1 = new Dm2();
        d1.add(10);
        d1.add(10,20);
    }
}