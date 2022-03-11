/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author User
 */
public class Rectangle implements CalculateArea {
    private double length, width;
    
    public Rectangle(double Length, double Width){
        length = Length;
        width = Width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    
    @Override
    public double calculateArea() {
        return length*width;
    }

    
    @Override
    public double calculateAround() {
        return 2 * (length + width);
    }
}
