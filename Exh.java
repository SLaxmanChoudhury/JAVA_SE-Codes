class Exh
{
    public static void main(String[] args)
    {
        int a =10,b=0,c;
        System.out.println("start");
        try{
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("do not div by zero");
        }
        System.out.println("end");
    }
}