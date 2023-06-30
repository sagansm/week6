package me.ssagan.task5._main;

import me.ssagan.task5.controller.FactorialController;

//Создайте программу, вычисляющую факториал целого числа n,
// которое пользователь введёт с клавиатуры, используя цикл for.
public class _Main {
    public static void main(String[] args) {
        FactorialController controller = new FactorialController();
        controller.execute();
    }
}
