/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        int fourth = scan.nextInt();
        System.out.println(first + second + third + fourth);
    }
}
