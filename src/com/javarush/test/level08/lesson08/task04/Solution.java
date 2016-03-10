package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Isakov", new Date("May 2 2012"));
        map.put("Ismailov", new Date("June 2 2012"));
        map.put("Isakeev", new Date("July 2 2012"));
        map.put("Unusov", new Date("May 21 2011"));
        map.put("Irgaldiev", new Date("May 2 1992"));
        map.put("Isakov", new Date("July 2 1982"));
        map.put("Ulanov", new Date("October 2 1997"));
        map.put("Tarasenko", new Date("May 2 2012"));
        map.put("Voevodin", new Date("May 2 2012"));
        map.put("Ermakov", new Date("September 2 2012"));

        return map;

        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();


        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if(rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }


        //напишите тут ваш код

    }
}
