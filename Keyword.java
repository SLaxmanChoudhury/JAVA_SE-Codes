class Demo
{
    String name = "Laxman";
    int age = 22;
    {
        System.out.println("This code all about super & this keyword.");
    }
}
class Demo1 extends Demo{
    String name = "Kalia";
    int age = 21;
    void key(String name, int age)
    {
        System.out.println(name+"'s age is : "+age);
        System.out.println(this.name+"'s age is : "+this.age);
        System.out.println(super.name+"'s age is : "+super.age);
    }
}
class Keyword{
    public static void main(String[] args )
    {
        Demo1 d = new Demo1();
        d.key("KC",23);
    }
}