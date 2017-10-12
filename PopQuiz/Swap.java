package PopQuiz;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {


        // if the user enters nothing, we use our own defaultArray
        if (args.length == 0) {

            // declaring the array of 10, and a temp1 var
            int[] defaultArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int temp1;

            // for indexes in the array up to half the length
            for (int i = 0; i < defaultArray.length / 2; i++) {
                // give temp1 the value of the array at length-1-i so we don't lose it
                temp1 = defaultArray[defaultArray.length - 1 - i];
                // then give the length-1-i value to the array at index i
                defaultArray[defaultArray.length - 1 - i] = defaultArray[i];
                // then give the array at i the value of temp1 (the last value)
                // which we stored in the beginning
                defaultArray[i] = temp1;
            }

            // then print out all the values of the array, which are now in reverse order
            for (int i = 0; i < defaultArray.length; i++) {
                System.out.print(defaultArray[i]);
            }
        }
        // else we use the String array the user entered, same process but args is an array of strings
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


