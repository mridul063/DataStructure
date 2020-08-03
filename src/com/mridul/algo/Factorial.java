package com.mridul.algo;

public class Factorial {

    public static void main(String[] args) {

        Factorial method = new Factorial();
        System.out.println(method.factorial(5));

    }

    public int factorial(int number) {
        if(number == 1)
            return 1;
        else {
            return number * factorial(number -1);
        }
    }

}
