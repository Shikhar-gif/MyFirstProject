package ConditionalStatements;
import java.util.Scanner;
public class While {
    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//        String response = "";
//        while(!response.equals("Q")){
//            System.out.print("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//        }
//        System.out.println("You have quited the game");
//        System.out.print(response);

//        Scanner scanner = new Scanner(System.in);
//        int age = 0;
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        while(age < 0){
//            System.out.println("Your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
//
//        System.out.println("You are "+ age + " years old");

//        Scanner scanner = new Scanner(System.in);
//        int number = 0;
//        while(number < 1 || number > 10){
//            System.out.print("Enter a number between 1-10");
//            number = scanner.nextInt();
//        }
//        System.out.print("You picked : "+ number);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();

        }while(number <1|| number > 10);

        System.out.println("You picked "+ number);



        scanner.close();


    }
}
