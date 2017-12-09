package lesson.third;

public class Gift {
static Candy candy=new Candy();
static Jellybean jellybean=new Jellybean();

    public static void main(String[] args) {
        jellybean.setName("Мармелад");
        jellybean.setPrice(25);
        jellybean.setWeight(3);
        candy.setName("Маска");
        candy.setPrice(20);
        candy.setWeight(4);

        System.out.println(candy.getName());
        System.out.println(candy.getPrice());
        System.out.println(candy.getWeight());

        System.out.println(jellybean.getName());
        System.out.println( jellybean.getPrice());
        System.out.println(jellybean.getWeight());

    }



}
