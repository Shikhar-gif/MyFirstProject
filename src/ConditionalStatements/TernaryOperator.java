package ConditionalStatements;

public class TernaryOperator {
    public static void main(String[] args){
//        temporary opearotor ? = (condition)? true: false
        int score = 55;
        String passOrfail = (score >= 50) ? "Pass": "Fail";
        System.out.println(passOrfail);

        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M";
        System.out.println(timeOfDay);


    }
}
