package com.metanit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        System.out.println("Hello world");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
        scan.close();

        char s_num = (char) num;
        System.out.println(s_num);


        System.out.println(sum(2, 3));          // 5
        System.out.println(sum(4.5, 3.2));      // 7.7
//        System.out.println(sum(4, 3, 7));       // 14
    }

    static int sum(int x, int y){

        return x + y;
    }
    static double sum(double x, double y){

        return x + y;
    }
//    static int sum(int x, int y, int z){
//
//        return x + y + z;
//    }
}
