package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        Person person = null;
        if (args[0].equals("-c"))
        {
            if (args[2].equals("м"))
                person = Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
            else if (args[2].equals("ж"))
                person = Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        } else if (args[0].equals("-u"))
        {
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
            if (args[3].equals("-м"))
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            else if (args[3].equals("ж"))
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
        } else if (args[0].equals("-d"))
        {
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);

        } else if ((args[0].equals("-i")))
        {
            person = allPeople.get(Integer.parseInt(args[1]));
            String name = person.getName();
            String sex;
            if (person.getSex() == Sex.MALE)
                sex = "м";
            else
                sex = "ж";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date = simpleDateFormat.format(person.getBirthDay());
            System.out.println(name + " " + sex + " " + date);
        }

    }
}
