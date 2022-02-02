package com.oscar;

public class Q12 {
    
    public static long factorial(int numero) {
        if(numero >= 1) {
            return numero*factorial(numero-1);
        } else {
            return 1;
        }
    }
}
