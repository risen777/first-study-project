package lesson.fifth;

/**
 * Created by Sergey
 */
public class Box {
  double  tweight=0;
    double tprice=0;

Cake[] firstCake =new Cake[0];

public void add(Cake cake) {
     int oldItem =firstCake.length;
    Cake[] secondCake = new Cake[firstCake.length + 1];
    for (int i = 0; i < firstCake.length; i++) {

        secondCake[i] = firstCake[i];
    }
    secondCake[oldItem] = cake;


    tprice+= cake.weight;

    tweight += cake.price;

}

    public double getTweight() {
        return tweight;
    }

    public double getTprice() {
        return tprice;
    }

    public Cake[] getFirstCake() {
        return firstCake;
    }

    public void printItems() {

        for (int i = 0; i < firstCake.length; i++) {

            System.out.println(firstCake[i]);

        }


}}
