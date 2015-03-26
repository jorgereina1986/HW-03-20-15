package nyc.c4q.jorgereina1986;

/**
 * Created by Jorge Reina on 3/17/15.
 *
 */
import java.util.Scanner;

public class PrettyTitle {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String sentence;

        System.out.print("Enter a title: ");
        sentence = input.nextLine();
        System.out.println();

        printTitle(sentence, '*');
    }


    public static void printTitle(String title, char character){
        //Goes through the sentence and capitalizes the first letter in each word.
        String [] word;
        word = title.split(" ");

        for(int i = 0; i < word.length; i++) {

            //checks to see if the word 'of' was typed and makes sure not to capitalize it in the text
            if (word[i].equalsIgnoreCase("of")) {
                System.out.print(word[i].toLowerCase() + " ");

            }
            else{
                System.out.print(word[i].toUpperCase().charAt(0) + word[i].substring(1) + " ");
            }
        }
        System.out.println();

        //For loop goes through the string and prints the character if it isn't a space.
        for(int i = 0; i < title.length(); i++){
            if(title.charAt(i) == ' ') {
                System.out.print(" ");
            }
            else{
                System.out.print(character);
            }

        }

    }


}
