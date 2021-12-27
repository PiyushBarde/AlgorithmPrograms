package com.bridgelabz.insertionsorting;

import java.util.ArrayList;

public class InsertionSortGenericsMain {
    public static <T extends Comparable<T>> void insertionSort(ArrayList<T> data) {
        int i, x =0;
        T key;
        for (i=1;i<data.size();i++){
            key= data.get(i);
            x = i - 1;
            while (x>=0 && data.get(x).compareTo(key) > 0){
                data.set(x+1, data.get(x));
                x--;
            }
            data.set(x+1,key);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.add("flowers");
        string.add("large");
        string.add("agreement");
        string.add("engine");
        string.add("trust");
        string.add("share");
        insertionSort(string);
        string.forEach(x -> System.out.println(x));
    }
}
