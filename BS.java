import java.util.*;
class BS 
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Enter a element : ");
        int a = sn.nextInt();
        int min = 0;
        int max = arr.length-1;
        int mid = 0;
        while(min<=max)
        {
            mid = (min+max)/2;
            if(a==arr[mid])
            {
                System.out.println("Your number "+a+" is present tha array at the index no." +mid);
                break;
            }
            
            else if(a<arr[mid])
            {
                max = mid-1;
            }
            else if(a>arr[mid])
            {
                min=mid+1;


            }
        }
        if(min>max)
        {
            System.out.println("This element is not present in the array.");
        }
    }
}