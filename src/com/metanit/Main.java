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
    }
}
