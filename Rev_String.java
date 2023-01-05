class Rev_String
{
    public static void main(String[] args)
    {
        String  s1 = "Kalia";
        String s2= "";
        int i =0;
        for(i=s1.length()-1;i>=0;i--)
        {
            s2 += s1.charAt(i);

        } 
            System.out.print(s2);
    }
}