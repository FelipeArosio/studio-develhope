/*
* Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
* In questa classe avere i metodi pubblici per ottenere le informazioni.
* Creare un ArrayList con n elementi e stamparlo in console.
* Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Felipe",27));
        listStudents.add(new Student("Gabriel", 27));
        listStudents.add(new Student("Miguel", 1));
        listStudents.add(new Student("Artur", 3));


        System.out.println("Lista completa: ");
        printStudents(listStudents);

    }
    public static void printStudents (ArrayList<Student> listStudents){
        for(Student student: listStudents) {
            System.out.println("nome: " + student.getName() + ", età: " + student.getAge());
        }
    }
}