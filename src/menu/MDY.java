package menu;

import java.util.Date;

public class MDY extends Date{
    public static void main(String[] args){
        System.out.println("date:");

        System.out.println(MDY.getMMDDYY());
    }
    public static String getMMDDYY(){
        MDY date = new MDY();
        int year = date.getYear() - 100;
        int month = date.getMonth() + 1;
        int day = date.getDate();
        return (String.valueOf(month) + "/" + String.valueOf(day) + "/" + String.valueOf(year));
    }
}