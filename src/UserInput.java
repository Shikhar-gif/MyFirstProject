//for user input to accept scanner
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("What is your CGPA ?");
        double cgpa = scanner.nextDouble();
//        If we want with spaces write nextLine otherwise next
        System.out.print("Are you a student ?(true/ false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello "+ name+ " my age is "+ age+" Your CGPA is : "+cgpa);

        if(isStudent){
            System.out.println("Your are enrolled as a Student");
        }
        else{
            System.out.println("You are not enrolled as a Student");
        }

//  Exercise to calculate area of rectangle
//
//
//        scanner.close();
        double width = 0;
        double height = 0;
        double area = 0;
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width ");
        width = scanner.nextDouble();
        System.out.print("Enter the height ");
        height = scanner.nextDouble();
        area = width * height;
        System.out.println("The area is : "+ area + " cm^2");
        scanner.close();



    }

}