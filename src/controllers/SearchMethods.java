package controllers;

import models.Person;

public class SearchMethods {   
    public Person binarySearchByAge(Person[] personas, int age) {
        int low = 0, high = personas.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (personas[mid].getAge() == age) {
                return personas[mid];
            } else if (personas[mid].getAge() < age) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; 
    }

    public Person binarySearchByName(Person[] personas, String name) {
        int low = 0, high = personas.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = personas[mid].getName().compareTo(name);
            if (comparison == 0) {
                return personas[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public boolean isSortedByAge(Person[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            if (personas[i].getAge() > personas[i + 1].getAge()) {
                return false;
            }
        }
        return true;
    }

    public boolean isSortedByName(Person[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            if (personas[i].getName().compareTo(personas[i + 1].getName()) > 0) {
                return false;
            }
        }
        return true;
    }
}
