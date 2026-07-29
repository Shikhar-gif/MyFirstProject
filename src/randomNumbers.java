import java.util.Random;
public class randomNumbers {
    public static void main(String[] args){
//        Random random = new Random();
//        int number;
//        number = random.nextInt(1,10)+1;
//        System.out.println(number);
////        here random will generate 32-bit integer
//
//        int number2;
//        int number3;

        Random random = new Random();
        double num = random.nextDouble(0,1);
        System.out.println(num);

        boolean isHeads;
        isHeads = random.nextBoolean();
        int count = 0;

        while(!isHeads){
            isHeads = random.nextBoolean();
            count++;

        }
        System.out.println("Total counts: "+ count);


    }
}
