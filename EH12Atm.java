import java.util.Scanner;

class OwnException extends Exception
{
    public OwnException(String msg)
    {
        super(msg);
    }
}
class CardHolder
{
    int Uid = 1212;
    int Upw = 1111;
    int Eid;
    int Epw;
    void enterdata()
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Welcome to Ama Bank :) ");
        System.out.println("Enter your User id : ");
        Eid = sn.nextInt();
        System.out.println("Enter your password : ");
        Epw = sn.nextInt();

    }
    void check() throws OwnException
    {
        if(Uid == Eid && Upw == Epw)
        {
            System.out.println("Withdraw your money.");
        }
        else
        {
            OwnException oe = new OwnException("Your entered data is wrong. Pleace try again.");
            System.out.println(oe.getMessage());
            throw oe;


        }
    }

}

class Bank
{
   public void reCheck()
    {
        CardHolder c = new CardHolder();

        try
        {
            c.enterdata();
            c.check();

        }
        catch(OwnException a)
        {
            try
            {
                c.enterdata();
                c.check();

            }
            catch(OwnException b)
            {
                try
                {
                    c.enterdata();
                    c.check();

                }
                catch(OwnException v)
                {
                    System.out.println("Your card is blocked becouse you entered 3 time wrong Userid & Password.");
                    System.exit(0);
                
                }
            }
        }
    }
}





public class EH12Atm
{
    public static void main(String []args)
    {
        Bank bk = new Bank();
        bk.reCheck();

    }
}