import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
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

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
         // or, if you're feeling fancy
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println(time);

    }
}





