import java.util.*;
class Phonebook
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter how many phone numbers to store : ");
        int num = n.nextInt();
        // 
        int b[][] = new int[num][];
        System.out.println("Enter the length for each of your numbers : ");
        for(int i = 0; i<b.length; i++ )
        {
           
                System.out.println("No. "+ i +" phone-number's length is : ");
                int c = n.nextInt();
                b[i] = new int[c];
        }
        System.out.println("Enter the digit of this number :");
        for(int i =0; i<b.length;i++)
        {
            for(int j = 0;j<b[i].length;j++)
            {
                System.out.println("Enter the "+ i+ "- number's " +j+" digit : ");
                b[i][j] = n.nextInt();
            }
        }
        System.out.println("Show all the numbers : ");
        for(int i =0 ;i<b.length; i++)
        {
            System.out.println("The "+i+"-number is : ");
            for(int j =0; j<b[i].length;j++)
            {
                System.out.print(b[i][j]);
               
            }
            System.out.println();
            

        }

       
    }
}