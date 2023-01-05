import java.util.Random;
import java.util.Scanner;

public class Game 
{

	public static void main(String[] args) 
    {

        int m;

        System.out.println("Welcome To Guesser Game!");
        System.out.println("Players Your Game Starts with Even or Odd Number : (Like perss 1 for Even or 0 for Odd Number)");
        Scanner c= new Scanner(System.in);
       
        m= c.nextInt();
        
   

        if(m==1)
        {
         
		    Random ranNo = new Random();
		
		    int randomNumber = ranNo.nextInt((30 - 2) + 1)+2;
        
            System.out.println("Player you Chose for Play with Even Number. ");

		    int count1 = 0;
		    int count2 = 0;
		    int count3 = 0;
		

		    while(true) 
            {
                System.out.print("Player1 Guess a Even Number (1-30) : ");		
		
		            Scanner scan = new Scanner(System.in);
		
		            int playerGuess1 = scan.nextInt();
		            count1++;

				
	            if (playerGuess1 == randomNumber)
                    {
		
		                System.out.println("Correct! It took you "+ count1 + " tries.");
		                break;
		
	                }
                else if(randomNumber> playerGuess1)
                    {
		                System.out.println("Nope! your number is lower");
		
	                }
                else 
                    {
		                System.out.println("Nope! your number is higher");		
			        }
	        }
		
		

	        while(true) 
            {
                System.out.print("Player2 Guess a Even Number (1-30) : ");
		        Scanner scan = new Scanner(System.in);
		
		       int playerGuess2 = scan.nextInt();
		       count2++;
		
	           if (playerGuess2 == randomNumber) 
               {
		
		            System.out.println("Correct! It took you "+ count2 + " tries");
		            break;
		
	            }
                else if(randomNumber> playerGuess2)
                {
		             System.out.println("Nope! your number is lower");
		
	            }
                else 
                {
		             System.out.println("Nope! your number is higher");		
			    }
		    }

            while(true) 
            {
                System.out.print("Player3 Guess a Even Number (1-30) : ");
	             Scanner scan = new Scanner(System.in);
	
	             int playerGuess3 = scan.nextInt();
	             count3++;
	
                if (playerGuess3 == randomNumber) 
                {
	
	              System.out.println("Correct! It took you "+ count3 + " tries");
	               break;
	
                }
                else if(randomNumber> playerGuess3)
                {
	               System.out.println("Nope! your number is lower");
	
                }
                else
        {
	         System.out.println("Nope! your number is higher");		
		}
	}

	if (count1==count2&& count2==count3) 
    {
		System.out.println("Match is a tie");
		
	}
    else if(count1==count2&& count3<count2) 
    {
		System.out.println("Player3 won the match");
	}
	else if(count1==count2&& count3>count2) 
    {
		System.out.println("Match is a tie between Player1 and Player2");
	}
	else if(count1==count3&& count2<count3) 
    {
		System.out.println("Player2 won the match");
	}
	else if(count1==count3&& count2>count3) 
    {
		System.out.println("Match is a tie between Player1 and Player3");
	}
	else if(count3==count2&& count1<count3) 
    {
		System.out.println("Player1 won the match");
	}
	else if(count3==count2&& count1>count3) 
    {
		System.out.println("Match is a tie between Player2 and Player3");
	}
	
	else if(count1<count2&& count1<count3) 
    {
		System.out.println("Player1 won the match");
	}
	else if(count2<count1&& count2<count3) 
    {
			System.out.println("Player2 won the match");
	}
	else if(count3<count2&& count3<count1) 
    {
		System.out.println("Player3 won the match");
    }
		
		System.out.println("The Number by system :" + randomNumber);

        }

    


 else
 {
    

		Random ranNo = new Random();
		
		int randomNumber = ranNo.nextInt();
        for(int i=1; i<30;i++){
            if(i%2==1){
                randomNumber = ranNo.nextInt(i);
            }
        }
        System.out.println("Player you Chose for Play with Odd Number.");

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		

		while(true) {System.out.print("Player1 Guess a Odd Number (1-30) : ");		
		
		Scanner scan = new Scanner(System.in);
		
		int playerGuess1 = scan.nextInt();
		count1++;

				
	    if (playerGuess1 == randomNumber)
            {
		
		        System.out.println("Correct! It took you "+ count1 + " tries.");
		        break;
		
	        }
        else if(randomNumber> playerGuess1)
            {
		        System.out.println("Nope! your number is lower");
		
	        }
        else 
            {
		        System.out.println("Nope! your number is higher");		
			}
	}
		
		

	while(true) {System.out.print("Player2 Guess a Odd Number (1-30) : ");
		Scanner scan = new Scanner(System.in);
		
		int playerGuess2 = scan.nextInt();
		count2++;
		
	if (playerGuess2 == randomNumber) 
    {
		
		System.out.println("Correct! It took you "+ count2 + " tries");
		break;
		
	}
    else if(randomNumber> playerGuess2)
    {
		System.out.println("Nope! your number is lower");
		
	}
    else 
    {
		System.out.println("Nope! your number is higher");		
			}
		}

while(true) {System.out.print("Player3 Guess a Odd Number (1-30) : ");
	Scanner scan = new Scanner(System.in);
	
	int playerGuess3 = scan.nextInt();
	count3++;
	
if (playerGuess3 == randomNumber) 
{
	
	System.out.println("Correct! It took you "+ count3 + " tries");
	break;
	
}
else if(randomNumber> playerGuess3)
{
	System.out.println("Nope! your number is lower");
	
}
else
{
	System.out.println("Nope! your number is higher");		
		}
	}


	if (count1==count2&& count2==count3) 
    {
		System.out.println("Match is a tie");
		
	}
    else if(count1==count2&& count3<count2) 
    {
		System.out.println("Player3 won the match");
	}
	else if(count1==count2&& count3>count2) 
    {
		System.out.println("Match is a tie between Player1 and Player2");
	}
	else if(count1==count3&& count2<count3) 
    {
		System.out.println("Player2 won the match");
	}
	else if(count1==count3&& count2>count3) 
    {
		System.out.println("Match is a tie between Player1 and Player3");
	}
	else if(count3==count2&& count1<count3) 
    {
		System.out.println("Player1 won the match");
	}
	else if(count3==count2&& count1>count3) 
    {
		System.out.println("Match is a tie between Player2 and Player3");
	}
	
	else if(count1<count2&& count1<count3) 
    {
		System.out.println("Player1 won the match");
	}
	else if(count2<count1&& count2<count3) 
    {
			System.out.println("Player2 won the match");
	}
	else if(count3<count2&& count3<count1) 
    {
		System.out.println("Player3 won the match");
    }
		
		System.out.println("The Number by system :" + randomNumber);

        
    }

	}
	
}
