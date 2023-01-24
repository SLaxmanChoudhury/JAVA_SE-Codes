class KcImpl{
    static int a = 5;
    static int b = 18;
}


public class Variable extends KcImpl
{

    int a = 121;
    int b = 212;
    // int a = 1;
    public static void main(String[] args)
    {
        Variable vb = new Variable();
        vb.jj();
        Variable.compare();
    }
    void jj()
    {
        System.out.println(this.a);
    }

    static void compare(){
        int a = 14;
        int b = 12;
        System.out.println(KcImpl.a + " " + a + " " + KcImpl.b + " " + b);
    }
}

