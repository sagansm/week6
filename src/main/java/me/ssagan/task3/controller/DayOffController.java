package me.ssagan.task3.controller;

import me.ssagan.task3.model.Day;
import me.ssagan.task3.model.DayOff;
import me.ssagan.task3.view.DayOffWriter;

import java.util.Scanner;

public class DayOffController {
    private final DayOff dayOff = new DayOff();
    private final Scanner scanner = new Scanner(System.in);
    private final DayOffWriter writer = new DayOffWriter();

    public void execute() {
        Day i = Day.SATURDAY;
        writer.write(i + " is " + dayOff.detect(i));
    }
}
