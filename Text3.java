class Text3
{
    public static void main(String [] args)
    {
        StringBuilder a1 = new StringBuilder("Kalia");
        StringBuilder a2 = new StringBuilder("Kalia");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.toString().equals(a2.toString()));
    }
}