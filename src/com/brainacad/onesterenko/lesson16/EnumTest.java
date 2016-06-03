package com.brainacad.onesterenko.lesson16;

/**
 * Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week on for given enum
 * value.
 For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY.
 */
public class EnumTest {

        public enum MyDayOfWeek {
            SUNDAY(0),
            MONDAY(1),
            TUESDAY(2),
            WEDNESDAY(3),
            THURSDAY(4),
            FRIDAY(5),
            SATURDAY(6);

            public int getOrder() {
                return order;
            }

            public int order;
           private MyDayOfWeek(int order) {
               this.order = order;
            }
//             MyDayOfWeek nextDay (MyDayOfWeek day){
//                int ordr=  day.ordinal() +1;
//                 MyDayOfWeek nextDay =  MyDayOfWeek(ordr);
//                 return nextDay ;
//            }
        }
    }






