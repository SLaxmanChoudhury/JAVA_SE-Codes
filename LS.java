import java.util.*;
class LS
{
    public static void main(String [] args)
    {
        Scanner sn = new Scanner(System.in);
        int x = 1;
        System.out.println("Enter the length nof the array :");
        int ln = sn.nextInt();
        int arr[] = new int[ln];
        System.out.println("Enter the array elements : ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sn.nextInt();
        }
        System.out.println("Show the array : ");
        System.out.print("[");
        for(int m:arr)
        {
            System.out.print(m +" ");
        }
        System.out.println("]");
        System.out.println("Enter a number : ");
        int num = sn.nextInt();
        for(int i =0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                System.out.println("Your number "+num+" is prisent in the array at the index no. "+i);
                ++x;
                break;
            }
        }
        if(x==1)
        {
            System.out.println("Your number is not present of this array.");
        }
    }
}