class Demo10
{
    void demo10()
    {
        try
        {
            System.out.println("Method Sarted");
            System.exit(0);

        }
        finally
        {
            System.out.println("Method Ended");
        }
    }
   
}

class EH11
{
    public static void main(String[] args)
    {
        Demo10 d10 = new Demo10();
        d10.demo10();

    }
}