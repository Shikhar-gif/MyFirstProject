package Loops;

import org.w3c.dom.ls.LSOutput;

public class OverloadMethod {
//    overloaded methods = methods thata share the same name
//    but different parameter

    public static void main(String[] args){
        System.out.println(add(1,2,3));

    }

    static double add(double a, double b){
        return a + b;

    }
    static double add(double a, double b, double c){
        return a + b + c;
    }




}
