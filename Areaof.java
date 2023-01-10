import java.util.*;
abstract class Calculator
{
    float hight;
    double pi = 3.141;
    double result;
    abstract void hig();
  
    abstract void sol();
}
class Circle extends Calculator
{
    
    Scanner sn = new Scanner(System.in);
    void hig()
    {
        System.out.println("Enter the Redius : ");
        hight = sn.nextFloat();
    }
    void sol()
    {
        result = pi*(hight * hight);
        System.out.println("Area of this circle is : "+result);
    }


}
class Square extends Calculator
{
  
    Scanner sn = new Scanner(System.in);
    void hig()
    {
        System.out.println("Enter the Hight : ");
        hight = sn.nextFloat();
        
    }
    void sol()
    {
        result = hight * hight ;
        System.out.println("Area of this Square is : "+result);
    }

}
class Common
{
    void cmn(Calculator resu)
    {
        resu.hig();
        resu.sol();

    }
    

}



class Areaof
{
    public static void main(String[] args)
    {
        Common cm = new Common();
        Circle cl =new Circle();
        Square sq = new Square();
        cm.cmn(cl);
        cm.cmn(sq);

 


    }
}