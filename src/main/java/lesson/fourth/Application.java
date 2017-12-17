package lesson.fourth;
/**
 * Created by Sergey
 */
public class Application {
    public static void main(String[] args) {


    Gift gift=new Gift();


      gift.addCake (new Candy("Milka", 20,80));

       gift.addCake(new Jellybean("OREO",50,150));


        gift.printItems();



}

}

