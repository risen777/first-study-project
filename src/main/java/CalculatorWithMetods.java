import java.util.Scanner;

/**
 * @author Sergey
 * @see #addition(double, double)
 * @see #division(double, double)
 * @see #multiplication(double, double)
 * @see #subtraction(double, double)
 */
public class CalculatorWithMetods {
    public static void main(String[] args) {
        System.out.println("Введите операцию(Сложение/Вычитание/Деление/Умножение)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("Введите первое число");
        float first = scanner.nextFloat();
        System.out.println("Введите второе число");
        float second = scanner.nextFloat();

        if (choice.equals("Деление")) {
            System.out.printf("%.4f", division(first, second));
        } else if (choice.equals("Умножение")) {

            System.out.printf("%.4f", multiplication(first, second));
        } else if (choice.equals("Вычитание")) {
            System.out.printf("%.4f", subtraction(first, second));
        } else if (choice.equals("Сложение")) {
            System.out.printf("%.4f", addition(first, second));
        } else System.out.println("Вы где-то ошиблись или я");
        scanner.close();
    }


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


