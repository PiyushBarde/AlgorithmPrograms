package com.bridgelabz.bubblesort;

public class BubbleSortMain {

        public static void main(String args[])
        {
            BubbleSort ob = new BubbleSort();
            int arr[] = {64, 34, 25, 12, 22, 11, 90};
            ob.bubbleSort(arr);
            System.out.println("Sorted array :");
            ob.printArray(arr);
        }
    }

