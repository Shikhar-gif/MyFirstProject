package Loops;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args){
//        NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt(min,max+1);

        System.out.println("Number Guessing Game: ");
        System.out.printf("Guess a number %d-%d\n",min,max);
        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempt++;
            if(guess < randomNumber){
                System.out.println("Too LOW! Try Again");
            }
            else if(guess > randomNumber){
                System.out.println("Too HIGH! Try Again");
            }
            else{
                System.out.println("Correct Guess");
            }


        }while(guess != randomNumber);


        System.out.println("You have won , and took "+ attempt + " attempts");





    }
}
