package me.ssagan.task1.controller;

import me.ssagan.task1.model.Weather;
import me.ssagan.task1.view.WeatherWriter;

import java.util.Scanner;

public class WeatherController {
    private final Weather weather = new Weather();
    private final Scanner scanner = new Scanner(System.in);
    private final WeatherWriter writer = new WeatherWriter();

    public void execute() {
        System.out.println("Введите темературу");
        int temperature = scanner.nextInt();
        writer.write(weather.describe(temperature));
    }
}
