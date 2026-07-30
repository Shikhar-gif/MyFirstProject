package basics;

public class Arithmetic {
    public static void main(String[] args){

//     basics.Arithmetic Operators
        int x = 10;
        int y = 2;
        int z = x+ y;


        z = x + y;
        z = x * y;
        z = x/y;
        z = x % y;

//        x = x + y;

        System.out.println(z);

//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;


//        Increment and decrement operator
        x++;
        y++;

        System.out.println(x);

//       ORDER OF OPERATION [P-E-M-D-A-S]
//        privacy
//        exponent
//        multiplication
//        divison
//        addition
//        subtraction

        double result = 3 + 4 * (7-5)/2.0;
        System.out.println(result);


    }
}
