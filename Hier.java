class Common
{
    String a = "Choudhury";
}
class Sub1 extends Common
{
    String b = "Kalia";
    void disp()
    {
        System.out.println("My name is : " + b+ " " + a);

    }
}
class Sub2 extends Common
{
    String b = "Laxman";
    void show()
    {
        System.out.println("This is also my name : " + b+ " " + a);

    }
}
class Hier
{
    public static void main(String[] args)
    {
        Sub2 sb = new Sub2();
        Sub1 sub = new Sub1();

        sub.disp();
        sb.show();
    }
}