package edu.miracosta.cs113.change;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Recursive {

    static int[] combo = new int[100000];
    static int c=0;

    public static void ways(int n, int[] amounts, int[] combo, int count, int sum, int index) {
        if(sum == n) {
           printArray(combo, index);
        }

        if(sum > n) {
            return ;
        }

        for(int i=count;i<amounts.length;i++) {
            sum = sum + amounts[i];
            combo[index] = amounts[i];
            ways(n, amounts, combo, i, sum, index + 1);
            sum = sum - amounts[i];
        }
    }

    public static void printArray(int[] combo, int index) {
        for(int i=0;i < index; i++) {

            String combination = combo[i]+ ",";
            try {
                Files.write(Paths.get("src/main/java/edu/miracosta/cs113/change/CoinCombinations.txt"), combination.getBytes(), StandardOpenOption.APPEND);
            }catch (IOException e) {
                //exception handling left as an exercise for the reader
            }

            System.out.print(combination);
        }
        c++;
        System.out.println();
    }
}