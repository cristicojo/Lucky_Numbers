//lucky numbers = all numbers that contains 6 digit or 8 digit; if a number contains both digits is not a lucky number
//generate all lucky numbers between a given input l and another given input h


import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers {


    public void lucky(long l, long h) {

        List<Long> a = new ArrayList();

        System.err.println("Lucky numbers between " + l + " and " + h + ":");
        for (long i = l; i <= h; i++) {

            a.clear();

            long r;
            long m = i;
            long z = 6;
            long z1 = 8;

            while (m != 0) {

                r = m % 10;
                m = m / 10;

                a.add(r);

            }

            if (a.contains(z) && a.contains(z1))
                System.out.print("");

            else if (a.contains(z))
                System.out.println(i);

            else if (a.contains(z1))
                System.out.println(i);


        }
    }
}
