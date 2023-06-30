package me.ssagan.task4.model;

public class PowerOfTwo {

    public String Generate() {

        String str = "";

        int i = 1;
        while (i <= 512) {
            str = str + " " + i;
            i = i * 2;
        }

        str = str + "\n";

        i = 1;
        do {
            str = str + " " + i;
            i = i * 2;
        }
        while (i <= 512);

        return str;
    }

}
