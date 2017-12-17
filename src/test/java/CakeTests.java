import lesson.fourth.*;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * Created by Sergey
 */
public class CakeTests {

    @Test

    public  void weightOfGiftShouldBeZero (){
        Gift gift =new Gift();

        Assert.assertEquals("Вес пустой коробки должен равняться нулю",0,gift.getTotalWeight(),0);


    }
    @Test
    public void priceOfGiftShouldBeZero (){
        Gift gift =new Gift();

        Assert.assertEquals("Цена пустой коробки должена равняться нулю",0,gift.getTotalPrice(),0);
    }
@Test
    public  void totalWeightShouldbeSumOfItems(){
    Gift gift =new Gift();
    double weight1=20;
    double weight2=50;
    double weight3=40;
    gift.addCake(new Jellybean("мармеладка1",20,weight1));
    gift.addCake(new Candy("мармеладка1",60,weight2));
    gift.addCake(new Jellybean("мармеладка1",60,weight3));
   Assert.assertEquals("Вес равен сумме сладостей",weight1+weight2+weight3,gift.getTotalWeight(),0);
}
    @Test
    public  void totalPriceShouldbeSumOfItems(){
        Gift gift =new Gift();
        double price1=20;
        double price2=50;
        double price3=40;
        gift.addCake(new Jellybean("мармеладка1",price1,23));
        gift.addCake(new Candy("конфетка1",price2,22));
        gift.addCake(new Jellybean("мармеладка2",price3,22));
        Assert.assertEquals("Вес равен сумме сладостей",price1+price2+price3,gift.getTotalPrice(),0);
    }
    @Test
    public  void NameCandyIsNotJellybeanName(){
        Gift gift =new Gift();
        String name1="Мармеладка";
        String name2="Конфетка";
        gift.addCake(new Jellybean(name1,22,23));
        gift.addCake(new Candy(name2,2,22));
        assertThat(name1, is(not(name2)));
    }}
