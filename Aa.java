import java.util.Scanner;
public class Aa {
    public static void main(String[] args){
        char a;
        Scanner ch =new Scanner(System.in);
        System.out.println("Enter a char :");
        a = ch.next().charAt(0);
        int b= (int)a;
        if(b>=97 && b<=122){
            System.out.println("This cher is Lower case. ");
            int c =b-32;
            char d=(char)c;
            System.out.println("Tha uper case of in this char is - " +d);
        }
        else{
            System.out.println("This char is Upper case.");
            int c=b+32;
            char d=(char)c;
            System.out.println("The Lower case of in this char is - " + d);
        }



    }
}