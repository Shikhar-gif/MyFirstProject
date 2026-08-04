package basics;
import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args){
//        WEIGHT CONVERSION PROBLEM
        Scanner scanner = new Scanner(System.in);


//        DECLARE VARIABBLES
        double weight;
        double newWeight;
        int choice;

//        WELCOME MESSAGE
        System.out.println("Weight conversion problem");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Choose an option");
        choice = scanner.nextInt();

//        USER CHOICE
        if(choice == 1){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.4535924;
            System.out.println("The new weight in kgs is: "+ newWeight);

        }
        else if(choice == 2){
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.204623;
            System.out.println("The new weight in lbs is: "+newWeight);
        }
        else{
            System.out.println("Tht ws not a valid choice");
        }


    }
}
