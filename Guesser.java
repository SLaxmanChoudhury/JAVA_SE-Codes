import java.util.*;
class Gamer
{
    int h = 0;
    public void gamer()
    {
      Scanner sn = new Scanner(System.in);
        System.out.println("Gamer please guess a number : ");
      h= sn.nextInt();
      


    }
}
class Player 
{
    Scanner ip = Scanner(System.in);
    int len;
    public void setNum(){
        System.out.println("How many players :- ");
        int n = ip.nextInt();
        len = n;
    }
    int b[] = new int[len];
    public void play()
    {
        Scanner snn = new Scanner(System.in);
        
        b = new int[num1];
        for(int i = 0; i<num1 ;i++)
        {
            System.out.println("Player-" + i +" please guess a number : ");
            int num2 = snn.nextInt();
            b[i] = num2;

        }
    
    }
}
class Umpire 
{
    public void ump()
    {
        
        for(int i = 0; i<num1 ;i++)
        {
            if(b[i]==num)
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




class Guesser
{
    public static void main(String[] args)
    {
        Gamer gm = new Gamer();
        gm.gamer();
        
        Player pl = new Player();
        pl.play();
        Umpire um = new Umpire();
        um.ump();

    }
}