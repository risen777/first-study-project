package lesson.fifth;

/**
 * Created by Sergey
 */
public class Application {
    public static void main(String[] args) {
      Box box= new Box();
      box.add(new Jellybean(12,12,"dddd"));
      box.add(new Candy(12,14,"aaaaaaaaaaaaa"));
      box.printItems();
    }

}
