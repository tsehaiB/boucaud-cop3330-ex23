/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
import java.lang.Math;
public class App {
    Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        myApp.conditionals();
    }

    private void conditionals() {
        System.out.print("Is the car silent when you turn the key? ");
        String silent = inp.nextLine();
        if (silent.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String corroded = inp.nextLine();
            if (corroded.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            String slicking = inp.nextLine();
            if (slicking.equals("y")) {
                System.out.println("Replace the battery.");
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                String fail = inp.nextLine();
                if (fail.equals("y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.print("Does the engine start and then die? ");
                    String die = inp.nextLine();
                    if (die.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String injection = inp.nextLine();
                        if (injection.equals("y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
