package cse360assignment02;

import java.lang.*;

public class AddingMachine {
    private int total;
    private String memory;
    /* Memory variable will keep track of all of the transactions, and be returned
    by toString() method.
     */

    /* Constructor creates an object of AddingMachine(), initializing total to zero and memory to total.*/
    public AddingMachine() {
        total = 0;
        memory = String.valueOf(total);
    }

    /* getTotal() returns the value of the variable total.*/
    public int getTotal() {
        return total;
    }

    /* add() modifies the variable total by adding the value passed as the parameter.*/
    public void add(int value) {
        total += value;
        memory = " + " + String.valueOf(value);
    }

    /* subtract() modifies the variable total by subtracting the value passed as the parameter.*/
    public void subtract(int value) {
        total -= value;
        memory = " - " + String.valueOf(value);
    }

    /* toString() returns the String memory, which is modified as operations are done to the total.*/
    public String toString() {
        return memory;
    }

    /* clear() resets the total to zero, and resets the memory variable to equal the new total.*/
    public void clear() {
        total = 0;
        memory = String.valueOf(total);
    }
}
