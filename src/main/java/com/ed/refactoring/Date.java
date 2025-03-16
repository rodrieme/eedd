/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ed.refactoring;

/**
 *
 * @author elena
 */
public class Date {

    private int day;

    private int month;

    private int year;

    public Date(int day, int month, int year) {

        this.day = day;

        this.month = month;

        this.year = year;

    }
    

    


	public boolean valida() {

        if (day < 1 || day > 31) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

// determinamos la cantidad de días del mes:
        int monthDays = 0;

        switch (month) {

            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                monthDays = 31;
                break;

            case 4:

            case 6:

            case 9:

            case 11:
                monthDays = 30;
                break;

            case 2: // verificación de año bisiesto

                if ((year % 400 == 0)
                        || ((year % 4 == 0) && (year % 100 != 0))) {
                    monthDays = 29;
                } else {
                    monthDays = 28;
                }

                break;

        }

        if (day > monthDays) {
            return false;
        } else {
            return true;
        }

    }

}
