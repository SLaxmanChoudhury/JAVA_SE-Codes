class HNP
{
    public static void main(String[] args)
    {
         int n = 10;
       
        for(int i=0;i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || i==(n-1) || j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            System.out.print(" ");
    }
}