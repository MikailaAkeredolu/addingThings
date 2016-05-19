package io.akeredolumikaila;
import java.util.Scanner;


/**
 * Created by mikailaakeredolu on 4/28/16.
 */



public class NumberSums {

    public static void main(String[] args) {

        System.out.println("Enter  number: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        int sum = 0;
        for (int n = 1; n <= i; n++) {
            sum += n;
        }

        System.out.println(sum);

    }
}
