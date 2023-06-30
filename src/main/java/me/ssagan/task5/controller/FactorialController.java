package me.ssagan.task5.controller;

import me.ssagan.task5.model.Factorial;
import me.ssagan.task5.view.FactorialWriter;

import java.util.Scanner;

public class FactorialController {
    Scanner scanner = new Scanner(System.in);
    Factorial factorial = new Factorial();
    FactorialWriter writer = new FactorialWriter();

    public void execute() {
        System.out.println("Введите число");
        int n = scanner.nextInt();

        writer.write(n + "! = " + factorial.calculate(n));
    }
}
