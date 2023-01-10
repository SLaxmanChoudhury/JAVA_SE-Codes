abstract class Student
{
    abstract void name();
    
    abstract void regNo();
    
}
class Student1 extends Student
{
    void name()
    {
        System.out.println("My name is Kalia");
    }
    void branch()
    {
        System.out.println("Your branch is CSE");
    }
    void regNo()
    {
        System.out.println("My regNo is 1901348061");
    }
}
class Student2 extends Student
{
     void name()
    {
        System.out.println("My name is laxman");
    }
    void regNo()
    {
        System.out.println("My regNo is 54");
    }
    void branch()
    {
        System.out.println("Your branch is CSE");
    }


}
class Teacher
{
    void cla(Student st)
    {
        st.name();
        st.regNo();
       // st.branch();
       //((Student1) st).branch(); //down class casting
    }
}

class Abstract1
{
    public static void main(String[] args)
    {
        System.out.println("This code is all about Abstraction :-");
        Teacher tch = new Teacher();
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();

        tch.cla(s1);
        tch.cla(s2);


    }
}