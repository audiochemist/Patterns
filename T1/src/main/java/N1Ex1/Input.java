package N1Ex1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Input {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
    public static int readInt() {

        int value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.nextInt();
                valid = true;
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.err.println("Please enter a valid integer.");
                sc.nextLine();
            }

        }

        return value;
    }

    public static String readString() {

        String value = "";
        boolean valid = false;

        while (!valid) {
            try {
                value = sc.nextLine();
                if (value.isEmpty()) {
                    throw new Exception();
                } else {
                    valid = true;
                }
            } catch (Exception e) {
                System.err.println("Please enter a valid String");
                sc.nextLine();

            }
        }
        return value;
    }


}
