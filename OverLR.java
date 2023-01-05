import java.util.*;
class Bike
{
    void going(int x)
    {
        
        System.out.println("You going with your Bike.");
    }
}
class Car extends Bike
{
    void going(int x,int y)
    {
   
        System.out.println("You going with your Car.");
    }
}
class OverLR
{
    public static void main(String[] args)
    {
        Scanner ch = new Scanner(System.in);
        
        System.out.println("Your road is Good then pres '1' else press '0' . :");
        int a= ch.nextInt();
        Car cr = new Car();
        
        
        
        if(a==1)
        {
            cr.going(1,1);
        }
        else{
            cr.going(0);
        }
    }
}