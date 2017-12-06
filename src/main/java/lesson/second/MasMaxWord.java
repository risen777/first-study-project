package lesson.second;

import java.util.Scanner;

public class MasMaxWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[10];
        String value = "";
        int count = 0;
        System.out.println("Введите Exit кода зканчить ввод");
        do {
            System.out.println("Слово" + (count + 1) + ":");
            value = scan.nextLine();
            if (!value.equalsIgnoreCase("Сравнить")) {
                arr[count] = value;
                count++;
            }
        } while (!value.equalsIgnoreCase("Сравнить"));
        System.out.println("вордс");
        for (int i = 0; i < count;i++) {
            int a=arr[i].length();
            int b=arr[i++].length();
            if (a  > b) {System.out.println(arr[i]);
            }
            else System.out.println(arr[i++]);
        }
    }
}