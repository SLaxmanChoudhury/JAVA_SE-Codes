class Word_Rev
{
    public static void main(String[] args)
    {
        String  a = "Kalia Laxman";
        String b="";
        int len = a.length();
        for(int i = a.length()-1;i>=0;i--)
        {
            if(a.charAt(i) == ' ')
            {
                System.out.print(a.substring(i+1,len) + " ");
                len = i;
            }
            else if(i == 0)
            {
                System.out.print(a.substring(i,len));
                len = i;
            }

        }
 




       
    }
}