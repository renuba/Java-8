package com.company;

public class ClimbStairs {
    public static int countsteps(int n) {
//        Fib(n)=Fib(n−1)+Fib(n−2)
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
  public static void main(String[] args)
  {
    boolean result=true;
    result &=result & ( countsteps(4)== 5 );
    result &=result & ( countsteps(1)== 1 );
    result &=result & ( countsteps(2)== 2 );
    if(result)
        System.out.println("Pass");
    else
        System.out.println("Failed");
          }

}
//    Time complexity : O(n). Single loop upto nn is required to calculate n^{th}n
//        th
//        fibonacci number.
//
//        Space complexity : O(1)O(1). Constant space is used.