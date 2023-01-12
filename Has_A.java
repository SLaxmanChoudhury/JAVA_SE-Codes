class Address
{
    static void ads()
    {
        System.out.println("Giet");
    }
}
class Student
{
        // Address a = new Address();
    static void name()
    {
        System.out.println("Laxman");
    }
}
class College
{
    // Student student = new Student();
}
class Has_A
{
    public static void main(String[] args)
   {
    College clg = new College();
    


        // clg.student.a.ads();
        // clg.student.name();
        Address.ads();
   }
    
}