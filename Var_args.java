class Var_args
{
    void sum(int ... a)
    {
        int add = 0;
        for(int x:a)
        {
            add = add + x;
        }
        System.out.println("Sum of numbers is : " + add);
    }
    public static void main(String[] args)
    {
        Var_args v = new Var_args();
        v.sum();
        v.sum(10);
        v.sum(10,20);
        v.sum(10,20,30);
    }
}