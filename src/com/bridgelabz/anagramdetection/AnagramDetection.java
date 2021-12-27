package com.bridgelabz.anagramdetection;

public class AnagramDetection {
    public void sort(char[] wordList) {
        for (int i = 1; i <= wordList.length-1; i++) {
            char temp = wordList[i];
            int j = i - 1;
            while (j >= 0 && wordList[j]>(temp)) {
                wordList[j + 1] = wordList[j];
                j--;
            }
            wordList[j + 1] = temp;
        }
    }
}
