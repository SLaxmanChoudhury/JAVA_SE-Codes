import java.util.Scanner;
public class Fibo
{
    public static void main(String[] args)
    {
        int num1 = 0, num2 = 1;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter how many fibo num you want : ");
        int num = s.nextInt();
        System.out.print("Fibo num is : " + num1  +" "+ num2 +" ");
        int fibNum = num1 + num2;

        for(int l=0;l<num-2;l++)
        {
            
            System.out.print( fibNum + " ");
            num1 = num2;
            num2 = fibNum; 
            fibNum = num1 + num2;

            
        }
    }
}