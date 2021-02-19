package br.com.jesusrj;

import java.time.Instant;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {
        Date myBirthDay = new Date(353991599000L);
        Date mayDay15 = new Date(1273892400000L);

        boolean bornBefore = myBirthDay.before(mayDay15);
        boolean bornAfter = myBirthDay.after(mayDay15);

        System.out.println("I born at " + myBirthDay);
        System.out.println("Were you born before 15/05/2010? " + (bornBefore ? "Yes" : "No"));
        System.out.println("Were you born after 15/05/2010? " + (bornAfter ? "Yes" : "No"));

        // Another way
        switch (myBirthDay.compareTo(mayDay15)) {
            case -1:
                System.out.println("You were born before 15/05/2010!");
                break;
            case 0:
                System.out.println("You were born on the day 15/05/2010!");
                break;
            case 1:
                System.out.println("You were born after 15/05/2010!");
                break;
        }
    }
}
