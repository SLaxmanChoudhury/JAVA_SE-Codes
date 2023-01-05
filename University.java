import java.util.*;
class University
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter how many University in odisha : ");
        int uni = sn.nextInt();
        int b[][][] = new int[uni][][];
        System.out.println("Enter how many colleges in these university : ");
        for(int i = 0;i<b.length;i++)
        {
            System.out.println("Enter in university no." + i+"'s how many colleges : ");
            int clg = sn.nextInt();
            b[i]= new int[clg][];
        }
        System.out.println("Enter how many branches in each colleges");
        for(int i =0; i<b.length;i++)
        {
            for(int j =0;j<b[i].length;j++)
            {
                System.out.println("Enter the "+ i+ "- number's university's " +j+"- number's colleges how many branch ");
                int m = sn.nextInt();
                b[i][j] = new int[m];

            }
        }
        

        System.out.println("Below are the given datas :- ");
         for(int i =0; i<b.length;i++)
        {
             //System.out.println("University No." + i);
            for(int j =0;j<b[i].length;j++)
            {
               // System.out.println("College No." + j);
                
                     
                    System.out.println(i+ "- number university's " +j+"- number college's branch is " +b[i][j] );
                    


                
               
                
            }
        }


    }
}