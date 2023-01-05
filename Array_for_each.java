import java.util.*;
public class Array_for_each
{
    public static void main(String[] args)
    {
        int a;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        a=r.nextInt();
        System.out.println("Enter the element of an Array : ");
        int b[] = new int[a];
        for(int i=0;i<a;i++){
            b[i] =r.nextInt();
        }
        System.out.print("Your array is : ");
        for(int m : b)
        {
            System.out.print(m);
   
            
                System.out.print(" ");
            
        }

        System.out.print("Which location you want : ");
         int l =r.nextInt();
         for(int j=0;j<5;j++)
         {
            int l== m;
         }
         System.out.println(i);
    }
}