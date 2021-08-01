/*
 * This Java source file was generated by the Gradle 'init' task.
 */


package linter;



import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import static linter.App.linter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private App App;

    @Test
    public void testCheckLine() {

        //test 1
        List<String> message1 = new ArrayList<String>();
        String path1 = "D:\\ASAC\\401\\java-fundamentals\\linter\\resources\\no-error.js";
        assertEquals(message1,App.Linter(path1),"Error semicolon is missing.");

        //test 2
        List<String> message2 = new ArrayList<String>();
        String path2 = "D:\\ASAC\\401\\java-fundamentals\\linter\\resources\\one-error.js";
        assertEquals(message2,App.Linter(path2),"Error semicolon is missing.");


        //test 3
        List<String> message3 = new ArrayList<String>();
        String path3 = "D:\\ASAC\\401\\java-fundamentals\\linter\\resources\\few-error.js";
        assertEquals(message3,App.Linter(path3),"Error semicolon is missing.");

        //test 4
        List<String> message4 = new ArrayList<String>();
        String path4 = "D:\\ASAC\\401\\java-fundamentals\\linter\\resources\\many-error.js";
        assertEquals(message4,App.Linter(path4),"Error semicolon is missing.");

        //test 5
        List<String> message5 = new ArrayList<String>();
        String path5 = "D:\\ASAC\\401\\java-fundamentals\\linter\\resources\\empty.js";
        assertEquals(message5,App.Linter(path5),"Error semicolon is missing.");


    }


}