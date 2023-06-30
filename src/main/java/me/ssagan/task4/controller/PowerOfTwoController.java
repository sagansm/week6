package me.ssagan.task4.controller;

import me.ssagan.task4.model.PowerOfTwo;
import me.ssagan.task4.view.PowerOfTwoWriter;

public class PowerOfTwoController {
    private final PowerOfTwo powerOfTwo = new PowerOfTwo();
    private final PowerOfTwoWriter writer = new PowerOfTwoWriter();

    public void execute() {
        writer.write(powerOfTwo.Generate());
    }
}
