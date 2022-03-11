/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author User
 */
public class Circle implements CalculateArea {
    private double r;
    
    public Circle (double R){
        this.r = R;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PHI * (r * r);
    }

    @Override
    public double calculateAround() {
        return 2 * PHI * r;
    }
}
