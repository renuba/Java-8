package com.company;
import java.io.*;
import java.util.*;

    class CountRepeatingCharacters {
        public static String compress(String str) {
            if (str.isEmpty()) {
                return "";
            }

            char[] chars = str.toCharArray();
            StringBuilder builder = new StringBuilder();

            int count = 1;
            char prev = chars[0];
            for (int i = 1; i < chars.length; i++) {
                char current = chars[i];
                if (current == prev) {
                    count++;
                } else {
                    builder.append(prev).append(count);
                    count = 1;
                }
                prev = current;
            }
            return builder.append(prev).append(count).toString();
        }



        public static void check(String input, String expected)
 {
  if( compress(input).equals(expected))
  {
   System.out.println("Pass");
  }
  else
  {
   System.out.println("Fail, input [" + input + "]");
  }
 }


 public static void main(String[] args) {
  check("AABBBCCCD", "A2B3C3D1");
  check("ABCDE", "A1B1C1D1E1");
  check("KKKKK", "K5");
  check("", "");
  check("aaa", "a3");
  check("Abcda", "A1b1c1d1a1");
  check("a", "a1");
  check("aaBBBa", "a2B3a1" );  
 }
    }

