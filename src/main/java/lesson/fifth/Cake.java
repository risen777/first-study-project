package lesson.fifth;

/**
 * Created by Sergey
 */
public class Cake{
public double price;
public double weight;
private String name;

    public Cake(double price, double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
