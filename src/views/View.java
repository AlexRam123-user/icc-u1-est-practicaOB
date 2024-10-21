package views;

import models.Person;
import java.util.Scanner;

public class View {
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Ingresar Perosnas");

        System.out.println("100. Salir");
        return sc.nextInt();
    }

    public Person inputPerson() {
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName() {
        System.out.println("Ingrese el nombre: ");
        return sc.next();
    }

    public int inputAge() {
        System.out.println("Ingrese la edad: ");
        return sc.nextInt();
    }

    public int imputInt(String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    public void showMessage(String message) {
        System.out.println("LOG"+message);
    }

    public int selectSortingMethod() {
        System.out.println("Ingrese la condicion a ordenar: ");
        System.out.println("1. Por nombre");
        System.out.println("2. Poe edad");
        System.out.println("Ingrese una Opcion: ");
        return sc.nextInt();
    }

 /*    public int selectSearchCriterion() {

    }

    public void displayPersons(Person[]){

    }

    public void displaySearchResult(Person){

    }
*/
    
}
