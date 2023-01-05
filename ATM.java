import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to our ATM!"); 
        System.out.println();
    int c = 1234;
  int f,g,h,m,j,s,n;
    Scanner r = new Scanner(System.in);
       
         System.out.println("Enter Your PIN : ");
          f= r.nextInt();
        if(c==f)
        {
            System.out.println("Correct Pin! Press a Number to work with following task :");
        }
        else
        {
            System.out.println("Enter Wrong pin. Please Try Again! ");
        }
        int a =1000;
        boolean x = true;
      while(x){
        System.out.println("Perss 1 For Check Your Bal. ") ;
         System.out.println("Perss 2 For Creadit.") ;
          System.out.println("Perss 3 For Debite.") ;
           System.out.println("Perss 4 For EXit.") ;
           g= r.nextInt();
           if(g==1){
            System.out.println("Your Ballance is :" + a);
           }
           else if(g==2){
            System.out.println("Enter Your Creadit Amount :");
            h=r.nextInt();
            a=a+h;
            System.out.println("Now Your Ballance is : " + a);
           }
           else if(g==3){
             System.out.println("Enter Your Debite Amount :");
            j=r.nextInt();
            a=a-j;
        //    n=s-j;
            System.out.println("Now Your Ballance is : " + a );
           }
           else if(g==4){
            x=false;
            
           }
           else{
            System.out.println("Your Number is invalid! please try again!");
           }

      }

          
    }
}