package com.bridgelabz.permutationprogram;

public class Permutation {
    String[] arrOfStrings= new String[9];
    void permuteByUsingForLoopAndRecursion(String str, int lengthOfString, int sizeOfAnArray)
    {
        if (lengthOfString == sizeOfAnArray)
            System.out.println(str);
        else
        {
            for (int i = lengthOfString; i <= sizeOfAnArray; i++)
            {

                str = swap(str,lengthOfString,i);
                for(int index = 0;index<=8;index++) {
                    arrOfStrings[index] = swap(str, lengthOfString, i);
                }
                permuteByUsingForLoopAndRecursion(str, lengthOfString+1, sizeOfAnArray);
            }
        }
    }
//    int i = 0;
//    void permuteByUsingRecursion(String str, int lengthOfString, int sizeOfAnArray) {
//
//        if (i <= sizeOfAnArray) {
//
//            if (lengthOfString == sizeOfAnArray)
//                System.out.println(str);
//            else {
//
//                    str = swap(str, lengthOfString, i);
//                permuteByUsingRecursion(str, lengthOfString + 1, sizeOfAnArray);
//            }
//            i++;
//        }
//    }



    private String swap(String a, int i, int j) {


            char temp;
            char[] charArray = a.toCharArray();
   //     System.out.println("->" + String.valueOf(charArray));
            temp = charArray[i] ;
   //     System.out.println("-->" + String.valueOf(charArray));
            charArray[i] = charArray[j];
   //     System.out.println("--->" + String.valueOf(charArray));
            charArray[j] = temp;
    //    System.out.println("---->" + String.valueOf(charArray));
            return String.valueOf(charArray);
        }
    }
