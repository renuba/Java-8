package com.company;

import java.util.*;

public class BallaSelection {
    public static List<List<Integer>> findAllCombinations(int k, int n){
  List<List<Integer>> result = new ArrayList<>();
  List<Integer> state = new ArrayList<>();
  backTracking(result, state, k, n, 0);
  return result;  
  }


  public static void backTracking(List<List<Integer>> result, List<Integer> state, int k, int n, int index){

  if(state.size() == k){  // edge cases to handle, as well as to control dfs maneuver
   result.add(new ArrayList<>(state)); // best question to ask about shallow vs deep copy
   return;
  }
  for(int i = index ; i < n; i++){
   state.add(i);
   backTracking(result, state, k, n, i+1);
   state.remove(state.size() -1);
  }
 }

        // test cases ::
        public static void main (String[] args) {
            System.out.println(findAllCombinations(2,3)); // output should be [[0, 1], [0, 2], [1, 2]]
//            System.out.println(findAllCombinations(1,3)); // output should be [[0], [1], [2]]
//            System.out.println(findAllCombinations(4,3)); // output should be []
//            System.out.println(findAllCombinations(3,5)); // [[0, 1, 2], [0, 1, 3], [0, 1, 4], [0, 2, 3], [0, 2, 4], [0, 3, 4], [1, 2, 3], [1, 2, 4], [1, 3, 4], [2, 3, 4]]
          //  System.out.println(findAllCombinations(4,30)); // output should be the size :: 12650


        }

    }
