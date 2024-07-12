package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSample5 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter formatter =
          DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
        String nowStr = ldt.format(formatter);
        System.out.println(nowStr);
    }

}
