import java.util.*;
public class VorC
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = c.next().charAt(0);

         //char m[] ={a,e,i,o,u}
        if((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E' ) ||  (ch == 'i' || ch == 'I' ) || (ch == 'o' || ch == 'O' ) || (ch == 'u' || ch == 'U' )  )
        {
            System.out.println(" This character is Vowel.");

        }
        else{
            System.out.println("This character is Consonant.");
        }

    }
}