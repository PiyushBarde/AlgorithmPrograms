package com.bridgelabz.findyournumber;
import java.util.Scanner;

public class FindYourNumberMain {
    static void binarySearch(int start, int end) {
        Scanner sc = new Scanner(System.in);
        int mid = start + (end - start) / 2;

        System.out.println("is ur number more than or less than or equal to " + mid + " (More-M/less-L/Equal-E) ?");
        String ans = sc.next();
        if (ans.equals("E"))
            System.out.println("your number is = " + mid);

        else if (ans.equals("M")) {
            if (end - mid == 1) {
                binarySearch(end, end);
            }
            binarySearch(mid,end);
        }
        else {
            binarySearch(start, mid);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think a number");

        System.out.println("Enter the range in which ur number exist" +
                " Start = ");
        int start = sc.nextInt();
        System.out.println(" End = ");
        int end = sc.nextInt();

        binarySearch(start,end);


    }
}
