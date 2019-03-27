import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        long l = new Scanner(System.in).nextLong();
        long h = new Scanner(System.in).nextLong();

        Lucky_Numbers ln = new Lucky_Numbers();

        ln.lucky(l, h);


    }
}
