package me.ssagan.task3.model;

public class DayOff {
    public String detect(Day i) {
        String str = "";
        switch (i) {
            case MONDAY:
            case FRIDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY: {
                str = "workday";
                break;
            }
            case SATURDAY:
            case SUNDAY: {
                str = "day off";
                break;
            }
        }
        return str;
    }
}
