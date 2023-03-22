package ru.netology.Martynova5.services;

public class Vacation {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; //счетчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличение счётчика месяцев отдыха
                money = ((money - expenses) / 3);
            } else {
                money += income - expenses;
            }
        }
        return count;
    }
}
