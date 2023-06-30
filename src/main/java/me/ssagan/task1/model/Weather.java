package me.ssagan.task1.model;

public class Weather {
    public String describe(int temperature) {
        if (temperature < 0) {
            return "Сейчас очень холодно";
        } else if (temperature < 16) {
            return "Сейчас прохладно";
        } else {
            return "Отличный летний денек!";
        }
    }
}
