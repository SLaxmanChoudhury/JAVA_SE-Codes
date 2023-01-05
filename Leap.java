import java.util.*;

public class Leap{
    public static void main(String[] args){
        int c;
        System.out.print("Enter a year : ");
        Scanner a = new Scanner(System.in);
        c = a.nextInt();
        if(c%4==0){
            System.out.println("This year is Leap year");
        }
        else{
            System.out.print("This year is not a leap year");
        }


}

}
