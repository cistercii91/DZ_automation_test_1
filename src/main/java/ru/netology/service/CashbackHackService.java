package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "значение не должно быть отрицательным, а у вас : " + amount);
        }
        return boundary - amount % boundary;
    }
}