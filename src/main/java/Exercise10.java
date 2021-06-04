/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double item1 = scan.nextInt();
        System.out.print("Enter the quantity of item1: ");
        double q_item1 = scan.nextInt();

        System.out.print("Enter the price of item 2: ");
        double item2 = scan.nextInt();
        System.out.print("Enter the quantity of item2: ");
        double q_item2 = scan.nextInt();

        System.out.print("Enter the price of item 3: ");
        double item3 = scan.nextInt();
        System.out.print("Enter the quantity of item3: ");
        double q_item3 = scan.nextInt();

        double subtotal = ((item1*q_item1) + (item2*q_item2) + (item3*q_item3));
        double tax = 0.055 * subtotal;
        double total = tax + subtotal;

        System.out.printf("Subtotal: $%.2f\n",subtotal);
        System.out.printf("Tax: $%.2f\n",tax);
        System.out.printf("Total: $%.2f\n",total);

    }
}