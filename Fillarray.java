import java.util.*;
class Fillarray
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        for(int a:arr)
        {
            System.out.print(a);
        }
        Arrays.fill(arr,2);
        System.out.println();
        for(int b:arr)
        {
            System.out.print(b);
        }
        Arrays.fill(arr,1,3,9);
        System.out.println();
        for(int b:arr)
        {
            System.out.print(b);
        }
        System.out.println();
        int ar[]={10,55,78,65,25,56};
        Arrays.sort(ar);
        System.out.print("[");
        for(int y:ar)
        {
            System.out.print(y+" ");
        }
        System.out.println("]");
        int res =Arrays.binarySearch(ar,75);
        System.out.println(res);
        
    }
}
