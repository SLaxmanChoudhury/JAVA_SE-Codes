import java.util.*;
class Maxarray
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        int v = 0;
        System.out.println("Enter the length of the array : ");
        int ln = sn.nextInt();
        int arr[] = new int[ln];
        System.out.println("Enter the elements of the array : ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sn.nextInt();
        }
        System.out.println("Show the max element of these array :");
        for(int r:arr)
        {
             if(v<r)
             {
                v=r;
             }
        }
        System.out.println(v);
        int s= Integer.MIN_VALUE;
        System.out.print(s);
        

       
    }
}