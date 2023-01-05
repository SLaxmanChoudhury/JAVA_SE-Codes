import java.util.*;
class Arr2d
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("How many branch in GIET : ");
        int br = sn.nextInt();
        int arr[][][] = new int[br][][];
        
        for(int i =0; i<arr.length;i++)
        {
            System.out.println("How many Section of each branch No. :- " +i);
            int sec = sn.nextInt();
            arr[i]= new int[sec][];

        }
        for(int i =0; i<arr.length;i++)
        {
            for( int j=0;j<arr[i].length;j++)
            {
                System.out.println("How many students of on branch No :- " +i+", each section No. :- " +j );
                int stu = sn.nextInt();
                arr[i][j]= new int[stu];

            }
            

        }
        System.out.println("give the students mark.");
         for(int i =0; i<arr.length;i++)
        {
            for( int j=0;j<arr[i].length;j++)

            {
                for( int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println("Enter the matk for "+i+ "No branchs, "+j+" No sections, "+k+" No student's Mark : ");
                    arr[i][j][k]= sn.nextInt();





                }
               
              
                

            }
            

        }
        
        System.out.println("Show the data.");
         for(int i =0; i<arr.length;i++)
        {
            for( int j=0;j<arr[i].length;j++)

            {
                for( int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println(i+ "No branchs, "+j+" No sections, "+k+" No student's Mark is : ");
                     System.out.println(arr[i][j][k]);


                }
               
              
                

            }
            

        }
        

    }
}