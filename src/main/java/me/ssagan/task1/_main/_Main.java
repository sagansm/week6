package me.ssagan.task1._main;

import me.ssagan.task1.controller.WeatherController;

//Попросите пользователя ввести c клавиатуры температуру целым числом.
// Если она меньше 0, выведете на экран строку “Сейчас очень холодно”.
// Если она от 0 до 16, выведете на экран строку “Сейчас прохладно”.
// В другом случае выведете на экран строку “Отличный летний денек!”.
// Используйте оператор if..else.
public class _Main {
    public static void main(String[] args) {
        WeatherController controller = new WeatherController();
        controller.execute();
    }
}
