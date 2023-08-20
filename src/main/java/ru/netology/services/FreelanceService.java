package ru.netology.services;

public class FreelanceService {
    public int calculater(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхаем
                money -= expenses;
                money /= 3;
                counter++;

            } else {
                // работаем
                money += income;
                money -= expenses;
            }
        }
        return counter;
    }

}
