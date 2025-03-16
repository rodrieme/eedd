/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ed.refactoring;


import java.util.Arrays;
import java.util.List;

/**
 * Esta clase representa una fecha (día, mes, año) y contiene métodos para validarla.
 * Proporciona funciones para verificar si una fecha es válida y si un año es bisiesto.
 *
 * @author elena
 */
public class Date {

    private int day;   // Día de la fecha
    private int month; // Mes de la fecha
    private int year;  // Año de la fecha

    /**
     * Constructor para inicializar una fecha con día, mes y año.
     *
     * @param day   El día de la fecha.
     * @param month El mes de la fecha.
     * @param year  El año de la fecha.
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Valida si la fecha es correcta.
     * Verifica que el día esté dentro de los límites válidos (1-31) y que el mes esté entre 1 y 12.
     * Además, verifica que el día no exceda el número de días del mes correspondiente.
     *
     * @return true si la fecha es válida, false si no lo es.
     */
    public boolean valida() {
        // Verifica que el día y el mes estén dentro de los rangos válidos
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            return false;
        }

        // Obtiene el número de días del mes correspondiente y valida que el día no exceda ese número
        int monthDays = getMonthDays(month, year);
        return day <= monthDays;
    }

    /**
     * Obtiene el número de días del mes para un mes y año determinados.
     * 
     * @param month El mes de la fecha.
     * @param year  El año de la fecha.
     * @return El número de días del mes correspondiente.
     */
    private int getMonthDays(int month, int year) {
        int daysOfmonth = 0;
        List<Integer> meses31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);  // Meses con 31 días
        List<Integer> meses30 = Arrays.asList(4, 6, 9, 11);  // Meses con 30 días

        // Verifica si el mes tiene 31 días
        if (meses31.contains(month)) {
            daysOfmonth = 31;
            return daysOfmonth;
        }

        // Verifica si el mes tiene 30 días
        if (meses30.contains(month)) {
            daysOfmonth = 30;
            return daysOfmonth;
        }

        // Verifica el mes de febrero y si el año es bisiesto
        if (month == 2 && (Isleap(year))) {
            daysOfmonth = 29;
        }

        // Si no es bisiesto, febrero tiene 28 días
        if (month == 2 && (!Isleap(year))) {
            daysOfmonth = 28;
        }

        return daysOfmonth;
    }

    /**
     * Determina si un año es bisiesto.
     * Un año es bisiesto si es divisible por 4 y no es divisible por 100, 
     * salvo que también sea divisible por 400.
     *
     * @param year El año a verificar.
     * @return true si el año es bisiesto, false si no lo es.
     */
    private boolean Isleap(int year) {
        // Un año es bisiesto si es divisible por 4 y no divisible por 100, 
        // a menos que también sea divisible por 400
        if (year % 4 == 0 && year % 100 != 0) 
            return true;
        else 
            return false;
    }
}
