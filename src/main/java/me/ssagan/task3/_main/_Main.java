package me.ssagan.task3._main;

import me.ssagan.task3.controller.DayOffController;

//оздайте Enum для дней недели.
// Присвойте любое значение дня недели переменной i и выведете на экран,
// какой день был задан - будний или выходной.
// Проверка должна быть корректна для каждого дня недели. Используйте оператор switch..case
public class _Main {
    public static void main(String[] args) {
        DayOffController controller = new DayOffController();
        controller.execute();
    }
}
