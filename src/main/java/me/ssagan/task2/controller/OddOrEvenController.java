package me.ssagan.task2.controller;

import me.ssagan.task2.model.OddOrEven;
import me.ssagan.task2.view.OddOrEvenWriter;

import java.util.Scanner;

public class OddOrEvenController {
    private final OddOrEven oddOrEven = new OddOrEven();
    private final Scanner scanner = new Scanner(System.in);
    private final OddOrEvenWriter writer = new OddOrEvenWriter();

    public void execute() {
        System.out.println("Введите число");
        int n = scanner.nextInt();
        writer.write(oddOrEven.evaluate(n));
    }
}
