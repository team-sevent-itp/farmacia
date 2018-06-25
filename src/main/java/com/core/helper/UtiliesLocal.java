/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.helper;

import java.sql.Date;
//import java.util.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author nuevo
 */
public class UtiliesLocal {

    /*Estas funciones son para la transformacion de fechas tipo DATE a LOCALDATE*/
    public static LocalDate parseLocalDate(Date fecha) {
        LocalDate fechaLocalDate = null;
        return fechaLocalDate = fecha.toLocalDate();
    }

    public static Date parseDate(LocalDate local) {
        Date date = java.sql.Date.valueOf(local);
        return date;
    }

    public static LocalTime parseLocalTime(Time hora) {
        LocalTime horaLocalTime = null;
        return horaLocalTime = hora.toLocalTime();
    }

    public static LocalDate parseLocalString(String newDate) {
        LocalDate localDate1 = LocalDate.parse(newDate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        return localDate1;
    }

    public static LocalDate parseLocalUtil(Date fecha) {
        LocalDate date = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return null;
    }

}
