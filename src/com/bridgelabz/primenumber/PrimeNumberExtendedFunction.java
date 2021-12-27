package com.bridgelabz.primenumber;


public class PrimeNumberExtendedFunction {


    static void palindromeCheck(int subIndex) {

        int palindrome=0,remainder;
        int temp=subIndex;
        while(subIndex>0){
            remainder = subIndex % 10;
            palindrome = (palindrome * 10) + remainder;
            subIndex = subIndex / 10;
            }

        if (temp>10 && temp == palindrome) {
            System.out.println(temp + " is prime & palindrome");
        }
        else{
            System.out.println(temp + " is prime");
                 }

            }
        }

