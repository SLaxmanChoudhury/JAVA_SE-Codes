import java.util.*;
class For2d
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        int n=0;
        System.out.println("Enter the length of the array : ");
        int ln = sn.nextInt();
        int arr[] = new int[ln];
        System.out.println("Enter the elements of the array : ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sn.nextInt();
        }
        System.out.println("Sum of the total array elements is : ");
        for(int m:arr)
        {
           n+=m;
            
        }
         System.out.println(n);
        

       
    }
}