import java.util.Scanner;
/**@author Sergey*/

public class Calculator {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Введите операцию(Сложение/Вычитание/Деление/Умножение)");
        String i = s.nextLine();

        System.out.println("Введите первое число");
        int first = s.nextInt();

        System.out.println("Введите второе число");
        int second = s.nextInt();
        switch (i) {
            case "Сложение":
                System.out.println(first + second);
                break;
            case "Вычитание":
                System.out.println(first - second);
                break;
            case "Деление":
                System.out.println(first / second);
                break;
            case "Умножение":
                System.out.println(first * second);
                break;
        }
    }

}

