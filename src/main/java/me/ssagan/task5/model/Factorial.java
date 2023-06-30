package me.ssagan.task5.model;

public class Factorial {
    public int calculate(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
