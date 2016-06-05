package com.brainacad.onesterenko.lesson16;

import java.time.DayOfWeek;

import static com.brainacad.onesterenko.lesson16.EnumTest.*;
import static com.brainacad.onesterenko.lesson16.EnumTest.MyDayOfWeek.*;

/**
 * Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week on for given enum
 * value.
 For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY.
 Add to method main() code that read string value from console (using System.in and Scanner),
 then you must parse string value to particular enum value (using valueOf() method) and then print the name
 of next day of week to console.
 Execute the program.
 Example of program output:
 FRIDAY
 The next day of week: SATURDAY
 */
public class Main {
    public static void main(String[] args) {

  for (  DayOfWeek day : DayOfWeek.values()    ) {
          DayOfWeek thisDay = DayOfWeek.valueOf(String.valueOf(day));
        switch(thisDay){
            case MONDAY:
                System.out.println("My Java day:"+ MONDAY);
                break;
              case WEDNESDAY:
                System.out.println("My Java day:" + WEDNESDAY);
                  break;
              case FRIDAY:
                System.out.println("My Java day:"+ FRIDAY);
                  break;

           }

        }
   //     System.out.println(MyDayOfWeek.);
        }

    }
