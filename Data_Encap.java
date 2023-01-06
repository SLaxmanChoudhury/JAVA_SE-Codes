class Laxman
{
    private String name;
    private int age;
    private char blood;

    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    int getAge()
    {
        return age;
    }
    void setBlood(char blood)
    {
        this.blood = blood;
    }
    char getBlood()
    {
        return blood;
    }

}



class Data_Encap
{
    public static void main(String[] args)
    {
        Laxman i = new Laxman();
        i.setName("Laxman");
        i.setAge(21);
        i.setBlood('O');
        System.out.println("Name - " + i.getName());
        System.out.println("Age - " + i.getAge());
        System.out.println("Blood Gp - " + i.getName());

    }
}