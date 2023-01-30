interface StringPass
{
    String str(String st);
}

public class Lamb3
{
    public static void main(String[] args)
    {
        StringPass sp1 = (s1)-> s1 + "Laxman";
        StringPass sp2 = (s1)->s1 + "Kalia";

        printformate("Hello ",sp1);
        printformate("Hii " , sp2);

       
    }
     public static void printformate(String st, StringPass f)
        {
            String result = f.str(st);
            System.out.println(result);
        }
}