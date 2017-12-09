package lesson.second;

import java.util.Scanner;

public class MasMaxWord {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a=11;
        String[] arr = new String[a];
        String value = "";
        int count = 0;
        String  max="";
        System.out.println("Введите до " +(a-1)+" слов ,а затем Сравнить" );
        do {
            System.out.println("Слово" + (count + 1) + ":");
            value = scan.nextLine();
            if (!value.equalsIgnoreCase("Сравнить")) {
                arr[count] = value;
                count++;
            }
        } while (!value.equalsIgnoreCase("Сравнить"));
      //  System.out.println("Самое большое слово=");

        for(String word: arr)
        {
            if (word!=null && word.length()>max.length()){
                max=word;
             }
   else break;




        }
        System.out.println("Самое большое слово="+ max);

        }}

