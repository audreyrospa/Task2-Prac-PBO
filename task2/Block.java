/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author User
 */
public class Block extends Rectangle implements CalculateSpace {
    private double height;

    public Block (double Length, double Width, double height) {
        super(Length, Width);
        this.height = height;
    }

    Block(int lengths, int widths, int heights) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   
  
    @Override
    public double calculateVolume() {
        return super.calculateArea() * height;
    }

    @Override
    public double area() {
        return 2 * (super.calculateArea() + (super.getLength()*height)+(super.getWidth()*height));
    }
}
