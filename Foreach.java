import java.util.*;
class Foreach
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int a = sn.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the element of this array : ");
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = sn.nextInt();
        }
        System.out.println("Show the elements : ");
        System.out.print("[");
        for(int d:arr)
        {
            System.out.print(d + " ");
        }
        System.out.println("]");
    }
}