package main.Lesson13;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        AppData fileCSV = new AppData();
        String[] header = new String[3];
        header[0] = "Value 1";
        header[1] = "Value 2";
        header[2] = "Value 3";
        fileCSV.setHeader(header);

        Integer[][] data = new Integer[2][3];
        data[0][0] = 100;
        data[0][1] = 200;
        data[0][2] = 123;
        data[1][0] = 300;
        data[1][1] = 400;
        data[1][2] = 500;
        fileCSV.setData(data);
        File csv = fileCSV.save("text.csv");
        header[0] = "Value New";

        fileCSV.load(csv);

        System.out.println(fileCSV.getHeader()[2]);

    }
}