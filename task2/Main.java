/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        int chose;
        int loop = 0;
        int lengths, widths, heights;
        float r2;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("==========");
            System.out.println("Main Menu");
            System.out.println("1. Calculate Cuboid");
            System.out.println("2. Calculate Cylinder");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            chose = input.nextInt();
            
            if (chose == 1) {
                System.out.print("Input Length: ");
                lengths = input.nextInt();
                System.out.print("Input Width: ");
                widths = input.nextInt();
                System.out.print("Input Height: ");
                heights = input.nextInt();
                
                Block Cuboid = new Block(lengths,widths,heights);
                
                System.out.println("Area of ​​Rectangle= " + Cuboid.calculateArea());
                System.out.println("Perimeter of Rectangle= " + Cuboid.calculateAround());
                System.out.println("Volume of Cuboid= " + Cuboid.calculateVolume());
                System.out.println("Surface area of Cuboid= " + Cuboid.area());
                System.out.println("Repeat?(Yes: 1 || Tidak: 0)");
                loop = input.nextInt();
            } else if (chose == 2) {
                System.out.print("Input Height: ");
                heights = input.nextInt();
                System.out.print("Input Circle radius: ");
                r2 = input.nextInt();
                
                Tube Cylinder = new Tube(heights, r2);
                
                System.out.println("Area of ​​circle= " + Cylinder.calculateArea());
                System.out.println("Circumference= " + Cylinder.calculateAround());
                System.out.println("Volume of Cylinder= " + Cylinder.calculateVolume());
                System.out.println("Surface area of Cylinder= " + Cylinder.area());
                System.out.print("Repeat?(Yes: 1 || Tidak: 0)");
                loop = input.nextInt();
            }
          
        } while (loop == 1);
    }
}
