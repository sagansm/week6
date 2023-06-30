package me.ssagan.task2._main;

import me.ssagan.task2.controller.OddOrEvenController;

//Напишите программу, в которой пользователь вводит целое число и
// она выводит на экран,
// является ли целое число записанное в переменную n, чётным либо нечётным.
// Используйте тернарный оператор.
public class _Main {
    public static void main(String[] args) {
        OddOrEvenController controller = new OddOrEvenController();
        controller.execute();
    }
}
