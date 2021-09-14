/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask the user if the car is silent when they turn the key
        System.out.print("Is the car silent when you turn the key? ");
        String a1 = in.nextLine();
        //now check the answer
        //if yes, ask if the battery terminals are corroded
        if(a1.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String a2 = in.nextLine();
            //now check the answer
            //if the answer is yes, tell the user to clean terminals and try starting again
            if(a2.equals("y")) {
                System.out.print("Clean terminals and try again.");
            }
            //if the answer is no, tell the user to replace the batteries and try starting again
            else if(a2.equals("n")) {
                System.out.print("Replace cables and try again.");
            }
        }
        //if no, ask if the car makes a slicking noise
        else if(a1.equals("n")) {
            System.out.print("Does the car make a slicking noise? ");
            String a3 = in.nextLine();
            //if yes, tell the user to replace the battery
            if(a3.equals("y")) {
                System.out.print("Replace the battery.");
            }
            //if no, ask if the car cranks up but fails to start
            else if(a3.equals("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                String a4 = in.nextLine();
                //if yes, tell the user to check the spark plug connections
                if(a4.equals("y")) {
                    System.out.print("Check spark plug connections.");
                }
                //if no, ask the user if the engine starts and then dies
                else if (a4.equals("n")) {
                    System.out.print("Does the engine start and then die? ");
                    String a5 = in.nextLine();
                    //if yes, ask the user if the car has fuel injections
                    if(a5.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String a6 = in.nextLine();
                        //if yes, tell the user to get the car in for service
                        if(a6.equals("y")) {
                            System.out.print("Get in in for service.");
                        }
                        //if no, tell the user to ensure the choke is opening and closing
                        else if(a6.equals("n")) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    //if no, tell the user that this should not be possible
                    else if(a5.equals("n")) {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}
