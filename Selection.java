class Selection
{
    public static void main(String[] args)

    {
  
        int arr[] = {12,25,5,9,47,1};
        System.out.print("Before Sort : ");
        System.out.print("[");
        for(int a:arr)
        {
            System.out.print(a + " ");
        }
        System.out.println("]");
        
        for(int i =0 ; i<arr.length-1; i++)
        {
            int small =i;
            int j=0;
            for( j=(i+1);j<arr.length; j++)
            {
                if(arr[small]>arr[j])
                {
                  small = j;
                    
                }
            }
            int temp =arr[i];
            arr[i]=arr[small];
            arr[small]= temp;
        }
        System.out.println("After Selection Sort : ");
        for(int k:arr)
            {
               System.out.print(k +" ");
            }
    }
}