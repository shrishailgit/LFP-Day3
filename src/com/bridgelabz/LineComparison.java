package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public double x1,x2,y1,y2,x3,y3,y4,x4,lineLength1,lineLength2;
    Scanner s = new Scanner(System.in);
    public void calculateLineLength(){

        System.out.println("Welcome to Line comparison computation");
        System.out.println("enter the values");
        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();

        lineLength1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("line length :"+lineLength1);
    }
    public void checkEqual(){
        System.out.println("enter the values x3,y3,x4,y4");
        x3 = s.nextDouble();
        y3 = s.nextDouble();
        x4 = s.nextDouble();
        y4 = s.nextDouble();

        lineLength2 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("line length :"+lineLength2);

        if (lineLength1 == lineLength2){
            System.out.println("Two lines are equal");
        }
        else {
            System.out.println("Two lines are not equal");
        }
    }

    void lineCompare(){
        if (lineLength1 <=lineLength2){
            System.out.println("line1 is less than line2");
        }
        else {
            System.out.println("line1 is greater than line2");
        }
    }
    public static void main(String[] args) {

        LineComparison lc = new LineComparison();
        lc.calculateLineLength();
        lc.checkEqual();
        lc.lineCompare();

    }
}