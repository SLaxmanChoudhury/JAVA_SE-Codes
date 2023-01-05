class Palindrom
{
    public static void main(String[] args)
    {
        String a = "kak";
        String b= "";
        for(int i = a.length()-1; i>=0; i--)
        {
            b += a.charAt(i);
            
        }
        if(b.equals(a))
        {
            System.out.println(a+" is palindrom.");
        }
        else{
            System.out.println(a+" is not palindrom");
        }
        
    }
}
