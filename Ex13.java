import java.util.Scanner;
public class Ex13
{
    public static void main(String[] args)
    {
        char a1 = 'a';
        char b1 = 'b';
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s1 = sn.nextLine();
        char []ch = s1.toCharArray();
        for(int i = 0; i<= ch.length - 1; i++)
        {
            if(ch[i] == a1)
            {
                if(ch[i+1] == b1)
                {
                    System.out.println("True");
                }
                else
                {
                    System.out.println("False");
                }
            }
        }
        
    }
}