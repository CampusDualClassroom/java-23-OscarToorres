package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {

        Map<String, Person> mapPerson = new HashMap<>();

        mapPerson.put("person", new Person("John", "Smith"));
        mapPerson.put("teacher", new Teacher("María", "Montessori", "Educación"));
        mapPerson.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        mapPerson.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return mapPerson;

    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {

        map.put(key,value);

        return value;

    }

    public static void printMapValues(Map<String, Person> map) {

        for(Map.Entry<String,Person> entry : map.entrySet()){
            entry.getValue().getDetails();
        }

    }

    public static void main(String[] args) {
        Exercise23 ex = new Exercise23();
        Map<String, Person> mapPerson = new HashMap<>();
        mapPerson = ex.createHashMap();
        ex.printMapValues(mapPerson);
        System.out.println("====================");
        ex.addMapValue(mapPerson, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        ex.printMapValues(mapPerson);
    }

}
