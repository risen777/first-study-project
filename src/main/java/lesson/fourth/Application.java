package lesson.fourth;

import java.util.Scanner;

/**
 * Created by Sergey
 */
public class Application {
    public static void main(String[] args) {
        Gift gift = new Gift();
        int j = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите вы хотите добавить");
            Scanner scanner = new Scanner(System.in);
            String nameCake = scanner.nextLine();

            if (nameCake.equals("Milka")) {
                gift.addCake(new Candy("Milka", 20, 80));
                //  gift.printItems();
            } else if (nameCake.equals("OREO")) {

                gift.addCake(new Jellybean("OREO", 50, 150));

                //     gift.printItems();
            } else if (nameCake.equals("Удалить")) {
                Scanner scan = new Scanner(System.in);
                int itemdel = scan.nextInt();
                gift.DeleteItem(itemdel);

            }
            gift.printItems();



        }
        gift.getTotalPrice();
        gift.printValue();

    }
}


