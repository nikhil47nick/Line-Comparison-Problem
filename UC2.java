package com.bridgelabz.Day3.LineComparison;

import java.util.Scanner;

public class UC2 {

    public static void equal(double length1,double length2){
        if (length2 == length1) {
            System.out.println("Length is equal");
        }else{
            System.out.println("Length is not equal");
        }
    }


    public static void main(String[] args){


        double length1= Math.sqrt( Math.pow((3 - 2), 2) + Math.pow((7 - 6),2));
        double length2= Math.sqrt( Math.pow((1 - 2), 2) + Math.pow((8 - 6),2));

        equal(length1,length2);

    }
}
