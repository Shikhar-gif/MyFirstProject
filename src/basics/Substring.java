package basics;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args){

//        substring() -> A method used to extract a portion of a string
//        .substring(start,end)
        Scanner scanner  = new Scanner(System.in);


        String email;
        System.out.println("Enter your email: ");
        email = scanner.nextLine();
        int idx = -1;
        for(int i = 0;i < email.length();i++){
            if(email.charAt(i) == '@'){
                idx = i;
                break;

            }

        }
        String username = email.substring(0,idx);
        System.out.println("Username " +username);

    }
}
