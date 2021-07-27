package com.company;

public class FractionAddition {
    public static void main(String[] args)
    {
       int[] test1 = {3,9,3,6};


        // Function call
        System.out.println(fraction(test1));
    }

    private static String fraction(int[] test1) {
        int a = test1[0];
        int b = test1[1];
        int c = test1[2];
        int d = test1[3];
        int gcd = getgcd(b,d);
        int lcm = lcm(b,d, gcd);
        System.out.println(gcd);
        System.out.println(lcm);
        int nom = (lcm/b)*a + (lcm/d)*c;
        return ""+nom + "/"+lcm;
    }

    private static int lcm(int b, int d, int gcd) {
            return (b * d)/gcd;
    }

    public static int getgcd(int a, int b) {
        if (b == 0) return a;
        else return (getgcd (b, a % b));
    }

}
