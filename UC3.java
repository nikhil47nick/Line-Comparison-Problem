package com.bridgelabz.Day3.LineComparison;

public class UC3 {
    public static void compareTo(double length1,double length2){
        if (length2 < length1) {
            System.out.println("Length1 is greater");
        }else if(length2 > length1){
            System.out.println("Length2 is Greater");
        }else {
            System.out.println("Length is equal");
        }
    }


    public static void main(String[] args){


        double length1= Math.sqrt( Math.pow((3 - 2), 2) + Math.pow((7 - 6),2));
        double length2= Math.sqrt( Math.pow((1 - 2), 2) + Math.pow((8 - 6),2));

        compareTo(length1,length2);

    }
}
