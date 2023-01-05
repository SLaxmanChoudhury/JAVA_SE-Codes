import java.util.*;
import java.lang.*;
public class Nqn
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Number : ");
        Scanner c = new Scanner(System.in);
        int a =c.nextInt();
        int m = a % 1000;
        System.out.println(m);
        int l =a/1000;
        int k = m%100;
        int j = l*100;
        int y= j + k;
        System.out.println(y);
        int h = m % 100;
        int g  = h / 10;
        int d = g*10;
        int o = a - d;
        int aa = y %10;
        int ss = o - aa;
        double yy = ss * 0.1;
        int rh = (int)yy + aa;
        System.out.println(rh);
        int w = y%10;
        int q = w + 1000;
        int u = a - q;
        double z = u * 0.1;
        int s = (int)z;
        int v = s+100;
         System.out.println(v);

    }
}