package ru.netology.sqr;

public class SQRService {

    public int calcsqr(int startOfRange, int endOfRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrt = i * i;
            if (sqrt >= startOfRange) {
                if (sqrt<= endOfRange) {
                    counter++;
                }

            }
        }
        return counter;
    }

}