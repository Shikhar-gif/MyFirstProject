public class Main {

    public static void main(String[] args){

//        This is my first java program
        System.out.println("I like pizza!");
        System.out.println("It's a really good!");
        System.out.println("Buy me pizza");


        /*
        This is
        a
        multiline
        comment


         */
        System.out.println("shortcut is write sout and enter");

//variable -> a reusable container for a value
//        a variable behaves as if it was the value it contains
//
//        Primitive = simple value stored directly in memory(stack)
//        Reference = memory address(stack) that points to the (heap)
//
//        primitive vs reference
//        int           string
//        double        array
//        bool          object
//        char

//        2 Steps to creating a variable ->

//        1. declaration
//        2. assignment

        int age = 21; // declaration
        System.out.println(age);

//        if we do it int age = 30.5 it will give incampatible type
        System.out.println("The age is "+age+" age");
        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println("$" + price);
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isStudent);
        if(forSale){
            System.out.println("sale is on sale");
        }
        else{
            System.out.println("not in sale");
        }

        String name = "Bro Code";
        String food = "pizza";
        String email = "shikhar0538@gmail.com";
        String color = "red";
        String car = "Mustang";
        System.out.println(email);
        System.out.println("your average is grade is " + grade);

        if(!forSale){
            System.out.println("There is a " + car + " which is not for sale");

        }





    }

}
//public class Main {
//    public static void main(String[] args){
//        String name = "Bro Code";
//        int gta = 6;
//        double pi = 3.14159;
//        char gender = 'M';
//        boolean isAdmin = true;
//
//        System.out.println("The java channel name is "+ name);
//        System.out.println("Gta "+gta + " is not knowledge yet");
//        System.out.println("pie value is "+ pi);
//        System.out.println(gender + " represent to Male");
//        System.out.println("Is this "+ isAdmin);
//
//    }
//}


