import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        flipNHeads(5);
        clock();


    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return (word + "s");
        } else {
            return word;
        }
    }

    public static void flipNHeads(int num) {
        int flipCount = 0;
        int headCount = 0;


        while (true) {
            if (Math.random() < 0.5) {
                flipCount++;
                headCount = 0;
                System.out.println("tail");
            } else {
                headCount++;

                if (headCount == num) {
                    System.out.println("head");
                    System.out.println("It took" + " " + flipCount + "flips to flip" + " " + num + "heads in a row");
                    break;

                } else {
                    flipCount++;
                    System.out.println("head");
                }
            }

        }
    }

//    public static void clock() throws InterruptedException {
//        while (true) {
//            long millis = System.currentTimeMillis();
//            Thread.sleep(millis - millis % 1000);
//            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
//        }
//    }

    public static void clock() {
        Timer clockTime = new Timer();
        clockTime.schedule(new TimerTask() {
            public void run() {
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
        }, 1000, 1000);
    }

}

