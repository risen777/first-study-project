package lesson.second;

import java.util.Scanner;

/**
 * @author Sergey
 */

public class Calculator {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Введите операцию(Сложение/Вычитание/Деление/Умножение)");
        String i = s.nextLine();

        System.out.println("Введите первое число");
        double first = s.nextFloat();

        System.out.println("Введите второе число");
        double second = s.nextFloat();
        switch (i) {
            case "Сложение":
                System.out.printf("%.4f", (first + second));
                break;
            case "Вычитание":
                System.out.printf("%.4f", first - second);
                break;
            case "Деление":
                System.out.printf("%.4f", (first / second));
                break;
            case "Умножение":
                System.out.printf("%.4f", first * second);
                break;
            default:
                System.out.println("Вы где-то ошиблись или я");


        }

        s.close();

    }

    }




