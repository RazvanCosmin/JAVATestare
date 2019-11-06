package lab7.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read2 {

    public class Read2 {

        public float getFloat() {
            float x = 0;

            boolean repeat = false;
            do {
                try {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("enter a number: ");
                    x = scan.nextFloat();
                    repeat = false;
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect value, please enter a number");
                    repeat = true;
                }
            } while (repeat == true);

            return x;


        }

    }
}
