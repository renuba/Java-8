package com.company;

import java.util.Arrays;

public class coinsLeast {



    private static int getcoins(int[] coins, int V) {
        int m =coins.length;
        int[] table = new int[V+1];

        table[0] = 0;
//        Arrays.fill(table,Integer.MAX_VALUE);

        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++)
            table[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= V; i++)
        {
            // Go through all coins smaller than i
            for (int j = 0; j < m; j++)
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;


                }

        }

        if(table[V]==Integer.MAX_VALUE)
            return -1;

        return table[V];
    }

    public static void main(String[] args)
    {
        int[] coins= {1,5,10,25};
        int value = 78;
        System.out.println(getcoins(coins,value));
    }
}
