package controllers;

import models.Person;

public class SortingMethods {

    public void sortByNameWithBubble(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getName().compareTo(personas[j + 1].getName()) > 0) {
                    Person temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }

        }
    }

    public void sortByNameWithSelectionDes(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].getName().compareTo(personas[maxIdx].getName()) > 0) {
                    maxIdx = j;
                }
            }
            Person temp = personas[maxIdx];
            personas[maxIdx] = personas[i];
            personas[i] = temp;
        }
    }

    public void sortByAgeWithInsertion(Person[] personas) {
        int n = personas.length;
        for (int i = 1; i < n; i++) {
            Person actual = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > actual.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = actual;
        }
    }

    public void sortByNameWithInsertion(Person[] personas) {
        int n = personas.length;
        for (int i = 1; i < n; i++) {
            Person actual = personas[i];
            int j = i + 1;
            while (j >= 0 && personas[j].getName().compareTo(actual.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = actual;
        }
    }
}
