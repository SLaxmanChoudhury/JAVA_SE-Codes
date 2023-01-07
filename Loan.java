import java.util.*;
class Bank
{
    private int P;
    private int T;
    private int R;
    private int S = 2;

    void account()
    {
        System.out.println("Enter how many Farmer apply for loan : ");
        Scanner sn = new Scanner(System.in);
        int farmer = sn.nextInt();
        int a[] = new int[farmer];
        int b[] = new int[farmer];
        for(int i = 0;i<farmer;i++)
        {
            System.out.println("Farmer-"+(i+1)+" how many money to loan : ");
            int amo = sn.nextInt();
            a[i] = amo;
            System.out.println("Farmer-"+(i+1)+" how many time period : ");
            int tim = sn.nextInt();
            b[i] = tim;
        }
        for(int i = 0;i<farmer;i++)
        {
            int simpint = (a[i] * b[i] * S)/100;
            System.out.println("Farmer-"+(i+1)+" your simple interest is : " + simpint);
        }
        
    }

}



//PTR/100


class Loan
{
    public static void main(String[] args)
    {
        Bank bn = new Bank();
        bn.account();

    }
}