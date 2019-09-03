/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter three names:");
      String name1 = scan.nextLine();
      String name2 = scan.nextLine();
      String name3 = scan.nextLine();
      System.out.println(name3 + " " + name2 + " " + name1);
    }
}
