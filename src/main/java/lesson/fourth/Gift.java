package lesson.fourth;

import lesson.fifth.Cake;

import java.util.*;

/**
 * Created by Sergey
 */
public class Gift {
    Cakes[] mCakes = new Cakes[0];

    private double totalWeight = 0;

    private double totalPrice = 0;
    private AbstractList alist;


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


    public void DeleteItem(int itemdel) {
        int oldItem=mCakes.length;
        Cakes[] newCakes = new Cakes[oldItem-1];



        for (int i = 0; i < itemdel; i++) {

            newCakes[i] = mCakes[i];
        }
        for (int i = itemdel; i < oldItem; i++) {


            newCakes[i] = mCakes[i+1];
    }



        totalWeight -= mCakes[itemdel].weight;

        totalPrice -= mCakes[itemdel].price;
        mCakes = newCakes;
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
}
