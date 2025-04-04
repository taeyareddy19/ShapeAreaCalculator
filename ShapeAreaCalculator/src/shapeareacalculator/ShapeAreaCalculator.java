/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapeareacalculator;

/**
 *
 * @author taeya
 */
import java.util.Scanner;
public class ShapeAreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        double rectangleLength = 6;
        double rectangleWidth = 4;
        double squareSide = 8;
        double circleRadius= 10;
        
        double rectangleArea = rectangleLength * rectangleWidth;
        double squareArea = squareSide * squareSide;
        double circleArea = Math.PI * circleRadius * circleRadius;
        
        System.out.println("Rectangle area: " + rectangleLength + " * " +  rectangleWidth + " = " + rectangleArea );
        System.out.println("Square area: " + squareSide + " * " +  squareSide + " = " + squareArea);
        System.out.println("Circle area: " + circleRadius + " * " +  circleRadius + " = " + circleArea);
         
    }
} 