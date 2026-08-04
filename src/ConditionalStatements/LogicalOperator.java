package ConditionalStatements;
import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args){

//        && = AND
//        || = OR
//        ! = NOT

//        double temp = 20;
//
//        boolean isSunny = true;
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is Good 😊");
//            System.out.println("It is sunny outside ☀️");
//
//        }
//        else if(temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is Good 😊");
//            System.out.println("It is cloudy outside ☁️");
//
//        }
//        else if(temp > 30 || temp < 0){
//            System.out.println("The weather is bad 😪");
//        }

        Scanner scanner = new Scanner(System.in);

//        username must be between 4-12 characters
//        username must not contain spaces or underscores

        String username;
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username is too short or too long");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscore");
        }
        else{
            System.out.println("Welcome "+ username);
        }

        scanner.close();


    }
}
