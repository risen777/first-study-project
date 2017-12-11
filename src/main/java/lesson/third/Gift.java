package lesson.third;

import java.util.Scanner;

/**
 * @author Sergey
 * @see #candy
 * @see #jellybean
 */
public class Gift {
    static Candy candy = new Candy();
    static Jellybean jellybean = new Jellybean();

    public static void main(String[] args) {


        while (true) {
            System.out.println("Сколько хотите мармеладок");

            Scanner scanner = new Scanner(System.in);


            //String whatCandy = scanner.nextLine();
            System.out.println("Введите вес");

            int weig1 = scanner.nextInt();

            System.out.println("Введите цену");
            int pric1 = scanner.nextInt();
            System.out.println("Сколько хотите конфеток");
            System.out.println("Введите вес");
            int weig2 = scanner.nextInt();
            System.out.println("Введите цену");
            int pric2 = scanner.nextInt();
            // String whatJellybean = scanner.nextLine();

            jellybean.setName("Мармеладки");
            jellybean.setPrice(pric1);
            jellybean.setWeight(weig1);
            candy.setName("Конфетки");
            candy.setPrice(pric2);
            candy.setWeight(weig2);
            //   int sum1 = pric1 + pric2;
            int sum2 = candy.getWeight(weig2) + jellybean.getWeight(weig1);

            int sum3 = candy.getPrice(pric2) * candy.getWeight(weig2) + jellybean.getPrice(pric1) * jellybean.getWeight(weig1);
            if (sum3==0) {

                System.exit(0);
            }
            System.out.println("В ваш подарок входят: " + '\n' + candy.getName() + '\n' + "Вес конфеток: " + candy.getWeight(weig2) + '\n' + "Стоимость конфеток: " + candy.getPrice(pric2) + '\n' + jellybean.getName() + '\n' + "Вес мармеладок: " + jellybean.getWeight(weig1) + '\n' + "Cтоимость мармеладок: " + jellybean.getPrice(pric1));
            //   System.out.println("Цена " + sum1);
            System.out.println("Общий вес подарочка: " + sum2);
            System.out.println("Общая стоимость подарочка: " + sum3);
            /*System.out.println(jellybean.getName());
            System.out.println(jellybean.getPrice());
            System.out.println(jellybean.getWeight());*/

        }
    }

}