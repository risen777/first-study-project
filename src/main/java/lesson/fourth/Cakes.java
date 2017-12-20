package lesson.fourth;
/**
 * Created by Sergey
 */
public abstract class Cakes {
String name;
double price=0;
double weight=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cakes(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
        public void setPrice(double price) throws Exception {

            if (price < 0) {

                throw new Exception("Цена не может быть отрицательной");

            }

            this.price = price;


    }

    public String description() {

        return name+" весом "+weight +" г. по цене "+price+" р. за шт.";

    }


}


