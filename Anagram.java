import java.util.*;
class Anagram
{
    public static void main(String[] args)
    {
        String a = "kalia is a";
        String b = "kalia is a";
        int h= 1;
        // char[] ch =a.toCharArray();
        // Arrays.sort(ch);
        // for(char ba:ch)
        // {
        //     System.out.print(ba);
        // }
        a = a.toLowerCase();
        b = b.toLowerCase();

        for(int i =0; i<a.length();i++)
        {
            for(int j =0;j<b.length();j++)
            {
               if(a.charAt(i) == b.charAt(j)) 
               {
                h =0;
                break;
               }
              
              
            }
            if(h == 0)
             continue;
            else{
                break;
            }
              

            
        }
        if(h==0)
        {
            System.out.println("this is a Anagram");
        }
        else{
            System.out.println("this is not a Anagram");
        }
    }
}