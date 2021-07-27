package com.company;
import java.util.*;
public class  IndicesTwoNumbers {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    public static void main(String[] arg){
        boolean result=true;
        int[] nums={7, 2, 15, 11};
        int[] tempoutput = twoSum(nums,9);

  result =result & tempoutput[0]==0 & tempoutput[1]==1;
 
 int[] nums1={3, 5, 2, -4, 8};

 int[] tempoutput1 = twoSum(nums1,7);

 result =result & tempoutput1[0]==1 & tempoutput1[1]==2;
  
 
 if(result)
 System.out.println("pass");
 else
  System.out.println("failed");

    }
}

//Time complexity: O(n). We traverse the list containing n elements only once. Each lookup in the table costs only O(1) time.
//
//Space complexity: O(n). The extra space required depends on the number of items stored in the hash table, which stores at most n elements.
