package lesson.second;

import java.util.Scanner;
/**
 * @author Sergey
 * @see #addition(double, double)
 * @see #division(double, double)
 * @see #multiplication(double, double)
 * @see #subtraction(double, double)
 */

public class Calc extends TwoChoice{




    public static double division(double a, double b) {
        return a / b;
    }

    public static double multiplication(double a, double b) {
        return a * b;

    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double addition(double a, double b) {
        return a + b;
    }


}

