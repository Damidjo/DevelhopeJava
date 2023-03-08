package ex_5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        //Variabile con valore 11
        int numvar = 10 + 1;
        System.out.println(numvar);
        //Ho assegnato alla variabile il valore della precedente meno uno
        numvar = numvar - 1;
        System.out.println(numvar);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        //Variabile con valore 2.5 moltiplicata per due
        double doubVar = 2.5 * 2;
        System.out.println(doubVar);
        //Altra variabile con lo stesso valore della variabile precedente diviso due
        double anotherDoub = doubVar / 2;
        System.out.println(anotherDoub);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        //Variabile con valore zero che rappresenta la scala celsius
        double celsius = 0;
        //Variabile con valore di celsius moltiplicato per 1.8 con addizione 32
        //Seguendo le regole per il calcolo delle scale.
        double fahrenheit = celsius * 1.8 + 32;
        System.out.print(celsius + " gradi Celsius equivalgono a: ");
        System.out.print(fahrenheit + " gradi Farenheit");
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        //Variabile con numero intero dieci
        int age = 10;
        //Ciclo for che tramite un incremento riusciamo a cambiare il valore della variabile di base
        for(age = 0; age < 15; age++);
        System.out.println(age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Write your code here
        //Variabile che contiene l'età con valore cinquanta
        int age = 50;
        //Grazie a -= riusciamo a sottrarre 50 dal valore corrente di age
        age -= 50;
        System.out.println(age);

        int secondAge = 50;
        //viene sottratto 25 dal valore di secondAge utilizzando l'operatore di sottrazione -
        //e il risultato (che è 25) viene assegnato nuovamente alla variabile secondAge.
        secondAge = secondAge - 25;
        secondAge = secondAge - 25;
        //assegna esplicitamente il valore 0 alla variabile secondAge, sovrascrivendo qualsiasi valore precedente.
        secondAge = secondAge = 0;
        System.out.println(secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 5;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
