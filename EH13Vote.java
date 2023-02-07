import java.util.Scanner;
class OverException extends Exception
{
    public OverException(String msg)
    {
        super(msg);
    }
}
class UnderException extends Exception
{
    public UnderException(String sms)
    {
        super(sms);
    }
}

class Enterdata
{
    int eage = 18;
    int age;
    void data()
    {
        System.out.println("Welcome to Voter Id Potal");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        age = sn.nextInt();
    }
    void compair() throws UnderException, OverException
    {
        if(age >= eage)
        {
            UnderException ue = new UnderException("You are eligible for apaly.");
            System.out.println(ue.getMessage());
       

        }
        else
        {
            OverException oe = new OverException("You are not eligible for apaly.");
            System.out.println(oe.getMessage());
            throw oe;
        }
    }
}

class Loopcall
{
    void call()
    {
        Enterdata ed = new Enterdata();
        try
        {
            ed.data();
            ed.compair();
        }
        catch( UnderException | OverException a)
        {
            try
            {
                ed.data();
                ed.compair();
            } 
            catch(UnderException | OverException b)
            {
                System.out.println("Your try limit is over please enter your data after 24 hours.");
                System.exit(0);
            }   
        }
    }
}



public class EH13Vote
{
    public static void main(String[] args)
    {
        Loopcall lc = new Loopcall();
        lc.call();

    }
}