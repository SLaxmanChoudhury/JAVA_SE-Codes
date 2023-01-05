class Insertion
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
        for(int i = 1; i<arr.length;i++)
        {
            int temp = arr[i];
            int j = 0;
            for(j= i-1;j >= 0;j--)
            {
                if(temp  <  arr[j])
                {
                   arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }

            arr[j+1] = temp;
        }
        for(int k= 0;k < arr.length;k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
}