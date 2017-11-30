import java.util.Scanner;
/**Created by Sergei on 29.11.17
 * @author Sergei
 * @see #someMethod()
  */
public class Base {

    /*First*/
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter int");
        int i =scanner.nextInt();
        System.out.println("enter str");
        String text=scanner.next();
        System.out.println("Integer"+ i);
        System.out.println("String"+ text);
        System.err.println("This is error stream");
        scanner.close();

    }
private String someMethod(){
return "string";

}



}
