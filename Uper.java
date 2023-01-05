class Uper
{
    public static void main(String[] args)
    {
        String a ="kalia";
        String b= "";
        int c =0;
        for(int i =0;i<a.length();i++)
        {
            c =(int) a.charAt(i);
            c -= 32;
            char temp = (char)c;
            System.out.print(temp);
            
            
        }
      
    }
}