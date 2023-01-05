import java.util.*;
class Super
{
    int Roll;
    String name;
    void input()
    {
        System.out.println("Enter your Data : ");
    }
}
class Sub extends Super
{
    void disp()
    {
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        name = ch.nextLine();
        System.out.println("Enter your Rollno : ");
        Roll = ch.nextInt();
        // Roll = 10;
        // name = "KC";
        System.out.println(name +"'s Rollnumber is : " + Roll);

    }

}
public class SimpleInheri
{
    public static void main(String[] args)
    {
        
        Sub s = new Sub();
        //s.input();
        s.disp();
    }
}
