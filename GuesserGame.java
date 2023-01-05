import java.util.*;

//this class for gammer guess a number.

class Gamer
{
    int num;
    int gamer()
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Gamer please Guess a number : ");
        int a = sn.nextInt();
        num = a;
        return num;
    }

}

//this class for player activity

class Player
{
    int num1;
    int playerno()
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter how many player to paly this game : ");
        int p = sn.nextInt();
        num1 = p;
        return num1;
    }
    //int num7;
    int[] player()
    {
        int arr[] = new int[num1];
        Scanner sn = new Scanner(System.in);
        for(int i=0; i<num1; i++)
        {
            
            System.out.println("Player-"+i+" please guess a number : ");
            int g = sn.nextInt();
            arr[i]=g;
          
       

        }
         return arr;
         
        
    }

}
class Umpire
{
    int num4;
    
    int num6;
   void ump()
    {
         Gamer gm = new Gamer();
         num4 = gm.gamer();
         
        Player pl = new Player();
       num6=pl.playerno();
       int[] num5;
       num5 = pl.player();
        
        for(int i = 0; i<num6 ;i++)
        {
            if(num4==num5[i])
            {
                System.out.println("Player-"+i+" is won the game.");
            }
            else
            {
                System.out.println("Player-"+i+" this game is over! plese try agein.");
            }
        }
    }

}


class GuesserGame
{
    public static void main(String[] args)
    {
       
        Umpire um = new Umpire();
        um.ump();


    }

}