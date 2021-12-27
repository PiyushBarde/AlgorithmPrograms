package com.bridgelabz.permutationprogram;

public class PermutationProgram
{
    public static void main(String[] args)
    {
        String firstWord = "CBD";
        String secondWord = "ABC";
        int lengthOfFirstWord = firstWord.length();
        int lengthOfSecondWord = secondWord.length();
        Permutation permutationOfFirstWord = new Permutation();
        Permutation permutationOfSecondWord = new Permutation();
        System.out.println("-----------first String------------");
        permutationOfFirstWord.permuteByUsingForLoopAndRecursion(firstWord,0,lengthOfFirstWord-1);
        System.out.println("-----------Second String------------");
        permutationOfSecondWord.permuteByUsingForLoopAndRecursion(secondWord,0,lengthOfSecondWord-1);



        for(int index=0;index<=8;index++){
            for(int jIndex=0;jIndex<=8;jIndex++){
                if(permutationOfFirstWord.arrOfStrings[index]==permutationOfFirstWord.arrOfStrings[jIndex]){
                    System.out.println("Array returned by two functions are equal");
                    break;
                }
                break;
            }
        }
    }
}