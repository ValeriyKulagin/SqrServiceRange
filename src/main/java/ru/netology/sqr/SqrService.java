package ru.netology.sqr;

public class SqrService {

    public int calcSqrRange(int rangeMin, int rangeMax) {

        int firstNumber = 10;
        int secondNumber = 99;
        int counter = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            if ((i * i) >= rangeMin && (i * i <= rangeMax)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
