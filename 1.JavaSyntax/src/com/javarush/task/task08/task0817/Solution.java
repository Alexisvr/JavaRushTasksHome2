package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("LastName1","Name1");
        map.put("LastName2","Name2");
        map.put("LastName3","Name3");
        map.put("LastName4","Name4");
        map.put("LastName5","Name5");
        map.put("LastName6","Name6");
        map.put("LastName7","Name77");
        map.put("LastName8","Name77");
        map.put("LastName9","Name77");
        map.put("LastName10","Name77");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap map) {
//напишите тут ваш код
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();


        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            HashMap.Entry entry1 = (HashMap.Entry) iterator.next();
             arrayList1.add((String) entry1.getValue());
        }




        for (int i = 0; i < arrayList1.size(); i++) {
            for (String anArrayList1 : arrayList1) {
                if (Objects.equals(arrayList1.get(i), anArrayList1)) {
                    arrayList2.add(arrayList1.get(i));}
            }
        }

        for (String anArrayList2 : arrayList2) {
            removeItemFromMapByValue(map, anArrayList2);
        }

//        Iterator i = map.entrySet().iterator();
//        while (i.hasNext())
//        {
//            HashMap.Entry tmp = (HashMap.Entry) i.next();
//            if(mas.contains(tmp.getValue())) {
//                removeItemFromMapByValue(map, (String) tmp.getValue());
//                mas.clear();
//                i = map.entrySet().iterator();
//            }
//            else
//                mas.add(tmp.getValue());
//        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
