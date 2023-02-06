class Demo11
{
    int demo11()
    {
        try
        {
            System.out.println("This Try block");
            return 10;

        }
        finally
        {
            System.out.println("This is finally block");
        }
    }
   
}

class EH10
{
    public static void main(String[] args)
    {
        Demo11 d11 = new Demo11();
        d11.demo11();

    }
}