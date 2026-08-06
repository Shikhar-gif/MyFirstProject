package Loops;

public class VariableScope {
    static int x = 3;
    public static void main(String[] args){
//        int x = 1;//LOCAL
//        int x = 2; //this would say variable is already defined
        System.out.println(x);
//        doSomething();


    }
    static void doSomething(){
//        int x = 2;

        System.out.println(x);
    }
}
