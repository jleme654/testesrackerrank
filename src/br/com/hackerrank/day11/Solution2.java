package br.com.hackerrank.day11;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        int sum = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
           		sum += arr[i][j];
            }
        }
//        System.out.println("\n"+sum);
//        System.out.println("\n"+arr[1][0]);
//        System.out.println("\n"+arr[1][2]);
        sum -= arr[1][0];
//        System.out.println("\n"+sum);
        sum -= arr[1][2];
        System.out.println("\n"+sum);
        
        
    }
}
