/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Felipe", 27));
        students.add(new Student("Gabriel", 27));
        students.add(new Student("Miguel", 3));
        students.add(new Student("Artur", 1));
        students.add(new Student("Roger", 55));
        students.add(new Student("Marcelo", 55));
        students.add(new Student("Victoria", 25));
        students.add(new Student("Leonardo",29));
        students.add(new Student("João Paulo", 35));
        students.add(new Student("Barbara", 37));
        students.add(new Student("Emily", 34));
        students.add(new Student("Erica", 21));

        System.out.println("Tutti gli studenti: ");
        printStudents(students);

        students.sort(Comparator.comparing(Student :: getName));
        System.out.println("Tutti gli studenti ordinati per i nomi: ");
        printStudents(students);

        students.sort(Comparator.comparing(Student :: getAge));
        System.out.println("Tutti gli studenti ordinati per l'età: ");
        printStudents(students);
    }

    public static void printStudents(ArrayList<Student> students) {
        for(Student student : students) {
            System.out.println("Nome: " + student.getName() + ", età: " + student.getAge());
        }
    }

}