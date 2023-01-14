class Employee
{
    private String name;
    private int age;

    public Employee(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    void setneme(String name)
    {
        this.name = name;
    }
    String getname()
    {
        return name;
    }
    void setage(int age)
    {
        this.age = age;
    }
    int getage()
    {
        return age; 
    }
    public String toString()
    {
        return "Employee [ Name = " + name + " and Age = " +age+" ]";
    }

}







class OverR
{
    public static void main(String[] args)
    {
        Employee emp = new Employee("Laxman" ,21);
        System.out.println(emp);

    }
}