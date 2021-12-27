package com.bridgelabz.insertionsorting;

public class InsertionSortMain{
    public static void main(String[] args) {
        String[] wordList = {"flowers", "large", "agreement", "engine", "trust", "share"};
        for (int i=1; i<= 5 ; i++){
            String temp = wordList[i];
            int j = i-1;
            while(j>=0 && wordList[j].compareTo(temp)>=0){
                wordList[j+1]=wordList[j];
                j--;
            }
            wordList[j+1]=temp;
            }
        for(int k=0;k<=5;k++){
            System.out.println(wordList[k]);
        }
    }
}
