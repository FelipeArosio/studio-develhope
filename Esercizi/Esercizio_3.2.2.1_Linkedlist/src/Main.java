/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata*/


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Fragola"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Mirtillo"));

        System.out.println("lista dei frutti");
        printFruits(fruits);

        fruits.addFirst(new Fruit("Pesca"));
        fruits.addLast(new Fruit("Abiccoca"));

        System.out.println("Lista dei frutti aggiornata: ");
        printFruits(fruits);

    }

    public static void printFruits (LinkedList<Fruit> fruits) {
        for(Fruit fruit : fruits) {
            System.out.println("Nome del fruto: " + fruit.getName());
        }
    }
}