class KC
{
    KC()
    {
        System.out.println("Constructor");
    }
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance block");
    }
    
}



class Staticblock
{
    public static void main(String[] args)
    {
        KC k = new KC();
        System.out.println("Hello");

    }
}