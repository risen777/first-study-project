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
            if (scanner.equals("Выход")) {

                System.exit(0);
            }

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
            jellybean.setName("мармеладки");
            jellybean.setPrice(pric1);
            jellybean.setWeight(weig1);
            candy.setName("конфетки");
            candy.setPrice(pric2);
            candy.setWeight(weig2);
            int sum = pric1 + pric2;
            int sum2 = weig2 + weig1;
            System.out.println("Ваш подарок " + candy.getName() + " и " + jellybean.getName() + ":");
            System.out.println("Цена " + sum);
            System.out.println("Вес " + sum2);

            /*System.out.println(jellybean.getName());
            System.out.println(jellybean.getPrice());
            System.out.println(jellybean.getWeight());*/


        }

    }
}
