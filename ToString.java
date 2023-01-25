class ToString
{
    String name;

    ToString(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
    public static void main(String[] args)
    {
        ToString ts = new ToString("Kalia");
        System.out.println(ts);

    }
}