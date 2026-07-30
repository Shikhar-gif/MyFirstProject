package basics;

import java.util.Scanner;
public class ifStatements {
    public static void main(String[] args) {
//        if Statement = performs a block of code if its condition is true
//        if we want emojis window + ;

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();


        if (name.isEmpty()) {
            System.out.println("You didn't entered anything");
        } else {
            System.out.println("Hello " + name + " !");
        }

        if (age >= 65) {
            System.out.println("You are an senior \uD83E\uDDD3");

        } else if (age >= 18) {

            System.out.println("Your are an adult");
        } else if (age < 0) {
            System.out.println("You haven't been born yet");
        } else if (age == 0) {
            System.out.println("You just born lil bro");
        } else {
            System.out.println("You are a child");
        }
    }


}