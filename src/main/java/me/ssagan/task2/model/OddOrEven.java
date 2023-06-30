package me.ssagan.task2.model;

public class OddOrEven {
    public String evaluate(int n) {
        return n % 2 == 0 ? "Число " + n + " четное " : "Число " + n + " нечетное ";
    }
}
