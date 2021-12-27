package com.bridgelabz.anagramdetection;


public class AnagramDetectionMain {


        public static void main(String args[])
        {
            char firstArray[] = {'a','d','c','b'} ;
            char secondArray[] = {'d','c','b','a'} ;
            AnagramDetection stringOne =  new AnagramDetection();
            AnagramDetection stringTwo =  new AnagramDetection();
            stringOne.sort(firstArray);
            stringTwo.sort(secondArray);


            // Function Call
            if (firstArray[0]==(secondArray[0]))
                System.out.println("The two strings are anagram of each other");

            else
                System.out.println("The two strings are not anagram of each other");
        }
    }

