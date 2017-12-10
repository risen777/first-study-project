package lesson.second;

import java.util.Scanner;
/**
 * @author Sergey
 */
public class TwoChoice {

    public static void main(String[] args) {


        System.out.println("Введите 1 ,чтобы калькуляторить,2,чтобы разобраться со словами");
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        Calc calc =new Calc();

        switch (value) {
            case 1:
                while (true) {
                    System.out.println("Введите операцию(Сложение/Вычитание/Деление/Умножение/Выход)");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.nextLine();
                    if (choice.equals("Выход")) {

                        System.exit(0);
                    }
                    System.out.println("Введите первое число");
                    float first = scanner.nextFloat();
                    System.out.println("Введите второе число");
                    float second = scanner.nextFloat();

                    if (choice.equals("Деление")) {
                        System.out.printf("%.4f", calc.division(first, second));
                    } else if (choice.equals("Умножение")) {

                        System.out.printf("%.4f", calc.multiplication(first, second));
                    } else if (choice.equals("Вычитание")) {
                        System.out.printf("%.4f", calc.subtraction(first, second));
                    } else if (choice.equals("Сложение")) {
                        System.out.printf("%.4f", calc.addition(first, second));


                    } else System.out.println("Вы где-то ошиблись или я");
                    System.out.println();
                }
            case 2:

                Scanner scan = new Scanner(System.in);
                int a=11;
                String[] arr = new String[a];
                String sense = "";
                int count = 0;
                String  max="";
                System.out.println("Введите до " +(a-1)+" слов ,а затем Сравнить" );
                do {
                    System.out.println("Слово" + (count + 1) + ":");
                    sense = scan.nextLine();
                    if (!sense.equalsIgnoreCase("Сравнить")) {
                        arr[count] = sense;
                        count++;
                    }
                } while (!sense.equalsIgnoreCase("Сравнить"));
                //  System.out.println("Самое большое слово=");

                for(String word: arr)
                {
                    if (word!=null && word.length()>max.length()){
                        max=word;
                    }
                    else break;




                }
                System.out.println("Самое большое слово="+ max);
scan.close();
s.close();
        }}

}


