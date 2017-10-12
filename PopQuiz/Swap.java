package PopQuiz;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {


        // if the user enters nothing, we use the defaultArray
        if (args.length == 0) {

            int[] defaultArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int temp1;

            for (int i = 0; i < defaultArray.length / 2; i++) {
                temp1 = defaultArray[defaultArray.length - 1 - i];
                defaultArray[defaultArray.length - 1 - i] = defaultArray[i];
                defaultArray[i] = temp1;
            }

            for (int i = 0; i < defaultArray.length; i++) {
                System.out.print(defaultArray[i]);
            }
        }
        // else we use the String array the user entered
        String temp2;
        for (int i = 0; i < args.length / 2; i++) {
            temp2 = args[args.length - 1 - i];
            args[args.length - 1 - i] = args[i];
            args[i] = temp2;
        }

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}


