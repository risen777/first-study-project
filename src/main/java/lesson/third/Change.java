package lesson.third;

import java.util.Random;

public class Change {

    public static void main(String[] args) {
        int[] array = new int[20];
        int MaxP = 0;
        int MaxO = 0;

        int max = array[0];
        int min = array[0];
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random()*20) - 10);
            System.out.print(array[i]+",");

            if (array[i] < max && array[i]>0) {
                max = array[i];
                MaxP = i;
            }
            if (array[i] < min&& array[i]<0) {
                min = i;
                MaxO = i;
            }
        }
        int tmp = array[MaxP];
        array[MaxP] = array[MaxO];
        array[MaxO] = tmp;
        System.out.println();
        for (int item: array) {
            System.out.print(item + ",");
        }
    }
}
