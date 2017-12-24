package lesson.fourth;

import java.util.ArrayList;

/**
 * Created by Sergey
 */
public class Gift {
    Cakes[] mCakes = new Cakes[0];

    private double totalWeight = 0;

    private double totalPrice = 0;




    public void addCake(Cakes cakes) {

        int oldItem = mCakes.length;

        Cakes[] newCakes = new Cakes[oldItem + 1];

        for (int i = 0; i < oldItem; i++) {

            newCakes[i] = mCakes[i];

        }

        newCakes[oldItem] = cakes;

        mCakes = newCakes;

        totalWeight += cakes.weight;

        totalPrice += cakes.price;

    }

    public void printValue() {
        System.out.println("Общий вес подарка: " + getTotalWeight() + " Общая цена подарка: " + getTotalPrice());
    }

    public void printItems() {

        for (int i = 0; i < mCakes.length; i++) {

            System.out.println(mCakes[i].description());
            //System.out.println("Общий вес подарка: "+getTotalWeight() +" Общая цена подарка: "+getTotalPrice());
        }


    }

    public void goods() {
        ArrayList states = new ArrayList<>();
        // добавим в список ряд элементов
        states.add("Dove");
        states.add("Mamba");
        states.add("Удалить");

        System.out.println(states);
    }

    void deleteСake(int itemDel) {
            int oldItemSize = mCakes.length;

            //создаем массив с размерностью на один больше чем старый

            Cakes[] newCakes = new Cakes[oldItemSize - 1];

            //копируем значения из старого массива, когда дошли до удаляемого элемента - выходим из цикла

            for (int i = 0; i < itemDel; i++) {

                newCakes[i] = mCakes[i];

            }

            //копируем значения из старого массива, пропускаем удаляемый элемент, не забывая про смещение

            for (int i = itemDel; i < oldItemSize - 1; i++) {

                newCakes[i] = mCakes[i + 1];

            }

            //обновляем веса и цену

            totalWeight -= mCakes[itemDel].weight;

            totalPrice -= mCakes[itemDel].price;

            //обновляем ссылку, и связываем с ней новый массив

            mCakes = newCakes;

            printItems();


        }


    public double getTotalWeight() {

        return totalWeight;

    }


    public double getTotalPrice() {

        return totalPrice;

    }


    public int getNumOfCakes() {

        return mCakes.length;


    }

    public static Gift generateGift() {

        return new Gift();

//       return null;

    }


}
