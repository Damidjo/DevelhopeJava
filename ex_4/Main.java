package ex_4;

public class Main {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 24;
        System.out.println("La mia età è: " + myAge + " anni");
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char myFirstInitial = 'g';
        int myAge = 24;
        System.out.println("La mia età è di " + myAge + " anni, e l'iniziale del mio nome è la lettera " + myFirstInitial);

    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //Variabile booleano con valore falso che valuta se qualcuno ha mangiato o no
        boolean hasEatenLunch = false;
        //Variabile double che indica i numeri con la virgola
        double lunchCost = 5.99;
        //Output che ci mostra i risultati della logica applicata
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
