package com.mridul.algo;

public class KaprekarNumber {
    //2025
    int number = 1000;
    public static void main(String[] args) {
        
        KaprekarNumber method = new KaprekarNumber();
        int square = (int) Math.pow(method.number, 2);
        System.out.println(method.checkIfKaprekar(square));
    }

    private boolean checkIfKaprekar(int square) {
        int original = square;
        int remainder = 0;
        int counter = 1;
        while (square != 0) {
            remainder = original % (int)Math.pow(10, counter);
            if((original / (int)Math.pow(10, counter)) == 0 || remainder == 0) {
                return false;
            }
            if (original / (int)Math.pow(10, counter) + remainder == number) {
                return true;
            } else {
                square = square / (int)Math.pow(10, counter);
                counter = counter + 1;
            }
        }

        return false;

}
}
