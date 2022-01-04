/*
Student: Alexey Vartanov
Maman 14: Question 1 - Generic class
 */
/**
 * IllegalArgumentException throw when arrays not a same size
 */

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(){
        super("The size of key array is different from size of values array");
    }
}
