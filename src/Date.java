package com.stackroute.unittest.pe3;

import java.util.*;
import java.time.*;
import java.text.*;

public class Date {

    public static void main(String []args){
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEEEEE dd/MM/yyyy");

        System.out.println(df.format(c.getTime()));

        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));

    }
}