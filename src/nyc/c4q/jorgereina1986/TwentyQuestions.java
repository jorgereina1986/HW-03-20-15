package nyc.c4q.jorgereina1986;
import java.util.Scanner;

/**
 * Created by Jorge Reina on 4/3/15.
 */
public class TwentyQuestions
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int ans = (int) (Math.random()*100000);
        //System.out.println(ans); // prints out random number



        System.out.println("Please guess a number from 0 - 100. You have 20 tries.");
        for(int i = 19; i >= 0; i--)
       {
           int guess = scanner.nextInt();

           //System.out.println(guess);

           if(guess < ans && guess >= 0 )
           {
               if(i==0) {
                   System.out.println("GAME OVER YOU RAN OUT OF TRIES");
                   break;
               }
               System.out.println("Your guess is too LOW. please try again. You have " + i + " tries left.");
           }
           else if(guess > ans && guess <= 100 )
           {
               if(i==0) {
                   System.out.println("GAME OVER YOU RAN OUT OF TRIES");
                   break;
               }
               System.out.println("Your guess is too HIGH. please try again. You have " + i + " tries left. ");

           }
           else if(guess == ans)
           {
               System.out.println("YOU GUESSED RIGHT! YOU WIN! GAME OVER!!!");
               continue;
           }
           else
           {
               System.out.println("You have entered an invalid character.You have " + i + " tries left.");
           }

       }
    }


}
