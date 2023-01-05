import java.util.*;
class Bubble    // Sinking or Excenge
{
    public static void main(String[] args)
    {
        int arr[] = {25,32,50,41,12};

        //int t[] =new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            for(int j =0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;

                }
                
                
                
            }
        }

        
        for(int j =0;j<arr.length;j++)
            {
               System.out.print(arr[j] +" ");
            }
        



        //     if(arr[i]>arr[i+1])
        //     {
        //         arr[i+1]=arr[i];
        //         t[i]=arr[i+1];
        //     }
        //     else{
        //        t[i]= arr[i];
        //     }
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(t[i]);
        // }

    }
}