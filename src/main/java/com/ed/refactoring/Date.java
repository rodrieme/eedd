/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ed.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            return false;
        }

        int monthDays = getMonthDays(month, year);
        return day <= monthDays;
    }

    private int getMonthDays(int month, int year) {
    	int daysOfmonth=0;
    	List<Integer> meses31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
    	List<Integer> meses30 = Arrays.asList(4, 6, 9, 11);

    	   	if (meses31.contains(month)) {
    	   		daysOfmonth=31;
    	   		return daysOfmonth;}
    	    if (meses30.contains(month)) {
    	    	daysOfmonth=30;
	   			return daysOfmonth;
	   		}
    	    if (month==2 && (Isleap(year))){
    	    	daysOfmonth=29;
    	    }
    	    if (month==2 && (!Isleap(year))){
    	    	daysOfmonth=28;
    	    }
    	return daysOfmonth;
    	
    }

    //a leap year can be divided by 4, and not by 100
    private boolean Isleap(int year) {
       if (year % 4 == 0 && year % 100 !=0) 
    	   return true;
       
       else return false;
    }
}
