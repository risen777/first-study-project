package lesson.fourth;

import java.io.*;

/**
 * Created by Sergey
 */
public class Write {
    public void Write() {

        try {

                System.setOut(new PrintStream("out.txt" ));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }}