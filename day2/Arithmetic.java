package br.com.hackerrank.day2;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      double tip = (T*M)/100;
      double tax = (X*M)/100;
      final double price = M + tip + tax;
      int total = (int) Math.round(price);
      System.out.println("The final price of the meal is $"+total);      
    }
}
