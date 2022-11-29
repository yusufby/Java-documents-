package day19passbyvalue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Practice01 {
    public static void main(String[] args) {
        Date date=new Date();

        date.getTime();
        System.out.println(date);
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now(ZoneId.of("Asia/Jakarta")));

        System.out.println(LocalDate.now().plusDays(200));
        System.out.println(LocalDate.now().minusWeeks(20));
        System.out.println(LocalDate.now().plusMonths(2));




    }


}