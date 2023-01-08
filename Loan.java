import java.util.*;
class Bank
{
    private float pA;
    private float tD;
    private float sI[];
    private int farmer;
    private static int rI;
    private float a[];
    private float b[];
    static{
        rI=2;
    }

    void input()
    {
        System.out.println("Enter how many Farmer apply for loan : ");
        Scanner sn = new Scanner(System.in);
        farmer = sn.nextInt();
        a = new float[farmer];
        b = new float[farmer];
        sI = new float[farmer];
         for(int i = 0;i<farmer;i++)
        {
            System.out.println("Farmer-"+(i+1)+" kindly enter the principal amount : ");
            pA = sn.nextFloat();
            a[i] = pA;
            System.out.println("Farmer-"+(i+1)+" kindlt mention time duration required : ");
            tD = sn.nextFloat();
            b[i] = tD;
        }
    }
    void process()
    {
         
         for(int i = 0;i<farmer;i++)
        {
             sI[i] = (a[i] * b[i] * rI)/100;
              System.out.println("Farmer-"+(i+1)+" your simple interest is : " + sI[i]);
            
        }

    }
   
       
   
       
        
    

}



//PTR/100


class Loan
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter 1 for running this application and -1 to exit : ");
        int choice = sn.nextInt();
        while(choice == 1)
        {
             Bank bn = new Bank();
             bn.input();
             bn.process();
             System.out.println("Enter 1 for using this application again or else -1 to exit :");
             choice = sn.nextInt();
            if(choice == 1)
            {
                 continue;
            }
            else{
                break;
            }


        }
        System.out.println("Thanks! and visit us again.");
       

    }
}