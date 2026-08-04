package Loops;
import java.util.Random;
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) throws InterruptedException {

//        for loop = execute certain amount of code

//        for(int i  = 1;i <= 10; i+=2){
//            System.out.println("pizza: "+ i);
//        }
//        System.out.println("\n");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for(int i = 0;i  < max; i++){
//            System.out.println(i);
//        }


//        Thread.sleep() -> we use this to pause the program
//        in miliseconds

        int start = 10;
        for(int i = start; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("HAPPY NEW YEAR");

//        Break and Continue;

        for(int i = 0;i < 10;i++) {
            if (i == 5) {
                continue;
            }

            System.out.print(i + " ");
        }









    }
}
