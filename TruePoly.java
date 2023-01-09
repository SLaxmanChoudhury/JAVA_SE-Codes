class Student
{
    void name()
    {
        System.out.println("My name is Laxman");
    }
    void regNo()
    {
        System.out.println("My regNo is 1901348061");
    }
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
}
class Student2 extends Student
{
    void regNo()
    {
        System.out.println("My regNo is 54");
    }void branch()
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

class TruePoly
{
    public static void main(String[] args)
    {
        System.out.println("This code is all about Loose Coupling :-");
        Teacher tch = new Teacher();
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();

        tch.cla(s1);
        tch.cla(s2);


    }
}