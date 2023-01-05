class Add{
     int num1 = 9, num2 = 10, res = 0;
     public static int num3 = 12;
    public void add(){
      res = num1 + num2;
     System.out.println(res);
    }
 }
public class Rev1{
    public static void main(String [] args){
        System.out.println("Hello Kalia banda...");
        Add ad = new Add();
        ad.add();
        ad.num2 = 20;
        System.out.println(ad.num2);
        ad.add();


        ad.res = ad.num1 - ad.num2;
        System.out.println(ad.res);
        ad.add();
        System.out.println(Add.num3);


    } 

}