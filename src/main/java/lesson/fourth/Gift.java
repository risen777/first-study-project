package lesson.fourth;
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



    public void printItems() {

        for (int i = 0; i < mCakes.length; i++) {

            System.out.println(mCakes[i].description());

        }

    }



    public double getTotalWeight() {

        return totalWeight;

    }



    public double getTotalPrice() {

        return totalPrice;

    }



    public int getNumOfCakes() {

        return mCakes.length;


}}
