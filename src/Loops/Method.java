package Loops;

public class Method {
    public static void main(String[] args){
//        method = a block of reusable code that is executed is executed when called()
//        System.out.println("Happy birthday to you!\n");
//        System.out.println("Happy Birthday to you!\n");
//        System.out.println("You are ");

        String name = "Bro";
        int age = 25;

//        happyBirthday();
        happyBirthday(name,age);

        String fullName =  getFullName("Spongebob","Squareparents");
        System.out.println(fullName);

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }


    }
    static void happyBirthday(String name,int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear you %s! \n",name);
        System.out.printf("You are %d years old!",age);

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " "+ last;
    }
    static boolean ageCheck(int age){
        if(age>= 18){
            return true;
        }
        else{
            return false;
        }

    }

}
