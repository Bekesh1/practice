/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bekesh.Practice;

import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter first num");
            int x = sc.nextInt();
            System.out.println("enter second num");
            int y = sc.nextInt();
            System.out.println("1. add");
            System.out.println("2. sub");
            System.out.println("3. mul");
            System.out.println("4. exit");
            System.out.println(" enter your choice[1-4]");
            int choice = sc.nextInt();
            int total = 0;

            switch (choice) {
                case 1:
                    total = x + y;
                    break;
                case 2:
                    total = x - y;
                    break;
                case 3:
                    total = x * y;
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
            System.out.println("total is " + total);
            System.out.println("Do you want to continue(Y/N)");
            String ch = sc.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }

    }
}
