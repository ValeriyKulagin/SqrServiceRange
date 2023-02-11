package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();


        int expected = 3;
        int actual = service.calcSqrRange(200, 300);
        System.out.println("Количество квадратов чисел в диапазоне = " + actual);
    }
}