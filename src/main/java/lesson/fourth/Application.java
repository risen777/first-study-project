package lesson.fourth;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Sergey
 */

public class Application {

    public static void main(String[] args) throws IOException {

        Gift gift = new Gift();

        Write write=new Write();
        for (int i = 0; i < 10; i++) {

            System.out.println("Введите какой товар добавить или можете удалить");
            gift.goods();

            Scanner scanner = new Scanner(System.in);



            String nameCake = scanner.nextLine();


            if (nameCake.equals("Dove")) {

                gift.addCake(new Candy("Dove", 20, 80));

                gift.printItems();

            } else if (nameCake.equals("Mamba")) {


                gift.addCake(new Jellybean("Mamba", 50, 150));


                gift.printItems();
            }
            else if (nameCake.equals("Записать")) {
                write.Write();

            }



            else if (nameCake.equals("Удалить") && i>0 ) {
                System.out.println("Введите номер удаляемого");
                Scanner scan = new Scanner(System.in);

                int itemDel = scan.nextInt();

                gift.deleteСake(itemDel);


            }


            System.out.println("**************");
            gift.printValue();
            System.out.println("**************");
        }


    }

}

