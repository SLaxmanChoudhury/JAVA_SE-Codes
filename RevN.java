import java.util.Scanner;
public class RevN{
    public static void main(String[] args){
        int a,r;
        Scanner b = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        a= b.nextInt();
         System.out.print("Reverse number is : ");
        while(a>0){
            r=a%10;
            System.out.print(r);
            a=a/10;
        }
    }

}