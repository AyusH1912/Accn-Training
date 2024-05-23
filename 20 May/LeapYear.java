package com.acc.lkm.JavaDay1;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("Year "+year+" is a Leap Year");
        }
        else{
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
    static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
