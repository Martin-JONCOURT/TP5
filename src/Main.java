import java.time.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        InitialiserTableau();
        triBulles(tableau); // appel de la fonction avec nom de la fonction main
    }

    static int SIZE = Integer.MAX_VALUE/1000;

    static int[] tableau =  new int[Integer.MAX_VALUE/1000];


    public static void InitialiserTableau(){
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(SIZE);
        }

        int[] tableauSelection = new int[SIZE];
        // arraycopy(src, startIndex, dest, startIndex, size)
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);

        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis(); // durée du temps entre le debut et la fin
        System.out.println("L’initialisation a pris " + duration + " ms");

    }

    public static void triSelection(int[] tableau){
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        int[] tableauSelection = new int[SIZE];
        // arraycopy(src, startIndex, dest, startIndex, size)
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);

        for (int i = 0 ; i < tableauSelection.length ; i++){
            int indiceMin = i ;
            for (int j = i ; j < tableauSelection.length ; j++){
                if (tableauSelection[j] < tableauSelection[indiceMin]) {
                    indiceMin = j;

                }
                }
                int swap = tableauSelection[i] ;
                tableauSelection[i] = tableauSelection[indiceMin] ;
                tableauSelection[indiceMin] = swap ;
                System.out.println(tableauSelection[i]);
        }

        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis(); // durée du temps entre le debut et la fin
        System.out.println("L’initialisation a pris " + duration + " ms");

    }

    public static void triInsertion(int[] tableau) {
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        int[] tableauSelection = new int[SIZE];
        // arraycopy(src, startIndex, dest, startIndex, size)
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);

        for (int i = 0; i < tableauSelection.length; i++) {
            int elementATrier = tableauSelection[i];
            int j = i;
            while (j > 0 && tableauSelection[j - 1] > elementATrier) {
                tableauSelection[j] = tableau[j - 1];
                j--;
            }
            tableauSelection[j] = elementATrier;
        }

        int test = tableauSelection.length;
        System.out.println(test + " d'élement dans le tableau");
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis(); // durée du temps entre le debut et la fin
        System.out.println("L’initialisation a pris " + duration + " ms");

    }

    public static void triBulles(int[] tableau){
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        int[] tableauSelection = new int[SIZE];
        // arraycopy(src, startIndex, dest, startIndex, size)
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);

        for (int i = 0; i < tableauSelection.length; i++) {
            for (int j = 1; j < tableauSelection.length-1; j++) {

                if (tableauSelection[j - 1] > tableauSelection[j]){
                    int t = tableau[j - 1];
                    tableauSelection[j-1] = tableauSelection[j];
                    tableauSelection[j] = t;
                }
            }
        }

        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis(); // durée du temps entre le debut et la fin
        System.out.println("L’initialisation a pris " + duration + " ms");
    }

    public static void quickSort(int[] tableau)
    {
        Instant start = Instant.now();

        //quicksort(tableau, 0, tableau.length-1);

        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’execution a pris " + duration + " ms");
    }


}