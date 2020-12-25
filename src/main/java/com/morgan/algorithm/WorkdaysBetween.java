package com.morgan.algorithm;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @Description 计算两个日期之间有多少个工作日
 * @Author Morgan
 * @Date 2020/12/17 12:21
 **/
public class WorkdaysBetween {

    public static void main(String[] args) {
        long betweenWorkdays = workdaysBetween(2020,12,1,2020,12,14);
        System.out.println(betweenWorkdays);
    }

    public static long workdaysBetween(int y1, int m1, int d1, int y2, int m2, int d2) {
        long result = 0;
        LocalDate currentDate = LocalDate.of(y1,m1,d1);
        LocalDate futureDate = LocalDate.of(y2,m2,d2);
        long daysDiffer = futureDate.toEpochDay() - currentDate.toEpochDay();
        long weeks = daysDiffer / 7;
        result = weeks * 5;
        long remainder = daysDiffer % 7;
        LocalDate beginDate = currentDate.plusDays(weeks * 7);
        for (int i=0; i <= remainder; i++){
            if (!DayOfWeek.SATURDAY.equals(beginDate.getDayOfWeek()) && !DayOfWeek.SUNDAY.equals(beginDate.getDayOfWeek())){
                result++;
            }
            beginDate = beginDate.plusDays(1);
        }
        return result;
    }
}
