/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author User
 */
public class Tube extends Circle implements CalculateSpace {
    private double height;

    public Tube (double height, double R) {
        super(R);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return PHI * super.getR() * super.getR() * height;
    }

    @Override
    public double area() {
        return 2 * PHI * super.getR()*(super.getR() + height);
    }
}
