/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;

/**
 *
 * @author vietn
 */
public class xDate {
    static SimpleDateFormat formater = new SimpleDateFormat();

    public static java.util.Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (ParseException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
    public static String toString(java.util.Date date, String pattenr){
        formater.applyPattern(pattenr);
        return formater.format(date);
    }
    public static java.util.Date addDays(java.util.Date date, long days){
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
    public static java.util.Date now(){
        return  java.util.Date.from(java.time.LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
}
