package com.company;

import java.util.Arrays;

public class coinsLeast {

    private static int getcoins(int[] coins, int V) {
        int m =coins.length;
        int[] table = new int[V+1];
        Arrays.fill(table,V+1);
        table[0] = 0;
        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= V; i++)
        {
            // Go through all coins smaller than i
            for (int coin: coins)
                if (coin <= i)
                {
                        table[i] = Math.min(table[i], table[i - coin] + 1);
                }
        }
        if(table[V]>V)
            return -1;

        return table[V];
    }

    public static void main(String[] args)
    {
        int[] coins= {1,5,10,25};
        int value = 11;
        System.out.println(getcoins(coins,value));
    }
}
