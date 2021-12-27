package com.bridgelabz.primenumber;

public class PrimeNumberMain {
    static int primeNumbers = 0;
    static int[] arrPrimeNumbers = new int[169];
    static PrimeNumberExtendedFunction palendromeCondition = new PrimeNumberExtendedFunction();
    public static void main(String[] args) {


        System.out.println("prime numbers from 0 - 1000 :");
a:    for(int index = 0; index<=1000; index++ ) {
            if(index==0){
                continue a;
            }
        int counter = 0;
        for(int subIndex = 1; subIndex<= index; subIndex++){

             if(index%subIndex==0){
                counter++;
            }
        }
        if(counter==2){
            primeNumbers++;
            arrPrimeNumbers[primeNumbers]=index;
            PrimeNumberExtendedFunction.palindromeCheck( index);

            }

  //          System.out.println(index);
            }
        }



    }
