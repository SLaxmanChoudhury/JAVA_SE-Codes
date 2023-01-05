class Panagram
{
    public static void main(String[] args)
    {
        String str = "the quick brown fox jumps over the lazy dog";
        str = str.replace(" ", "");
        int h =-1;
        for(int i = 97;i<123;i++)
        {
            char a =(char) i;
            int m = 1;
            for(int j=0;j < str.length();j++)
            {
                if(a == str.charAt(j))
                {
                    m = 0;
                break;
                }
            }
            if(m == 0)
            {
                h = 1;
                continue;

            }
             
            else{
                h = -1;
                break;
            }
              
        }
        if(h==1)
        {
            System.out.println("this is a Panagram");
        }
        else{
            System.out.println("this is not a Panagram");
        }
    }
}