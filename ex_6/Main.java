package ex_6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        double value = 15;
        double valueSquareRoot;
        System.out.println(Math.sqrt(value));
        valueSquareRoot = Math.sqrt(value);
        System.out.println(valueSquareRoot);

    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        System.out.println(Math.max(valueA, valueB));
        System.out.println(Math.min(valueA, valueB));

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        int reminder = totalMoney % costPerBurger;
        System.out.println("Ti rimarranno " + reminder + " euro se comprerai quanti più panini possibile");
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Con math.ceil riusciamo ad arrotondare il valore alla successiva cifra intera, superiore o uguale
        //Quindi con questo metodo 4.5 sarà arrotondato a 5.
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Invece math.floor è il contrario di quello precedente in quanto arrotonda il valore alla precedente cifra intera
        //Quindi 4.5, diverrà 4.
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        //Con math.round arrotondiamo alla cifra intera più vicina, nel caso di 4.5 sarà 5.
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Con math.pow invece restituiamo la potenza di un numero, in questo caso 4.5 elevato 2
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        //Stessa cosa qui, ma sarà 4.5 elevato 3
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        //In questo caso moltiplichiamo il nostro valore per ottenerne uno casuale in base al valore fornito
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}