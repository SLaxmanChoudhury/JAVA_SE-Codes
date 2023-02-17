import java.util.Scanner;
class Ex1
{
    public static void main(String... args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        String st = sn.nextLine();
        char[] a = st.toCharArray();

        System.out.println("Your Name's ripited character is : ");
        for(int i = 0; i<a.length-1; i++)
        {
            for(int j =1; j<a.length-1; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println(a[i]);
                    break;
                }

            }
        }

    }
}