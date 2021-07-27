package com.company;

   import java.util.*;

    public class BracketsBalanced {

        // function to check if brackets are balanced
        static boolean areBracketsBalanced(String expr)
        {
            // Using ArrayDeque is faster than using Stack class
           // Deque<Character> stack
                  //  = new ArrayDeque<Character>();
            Stack<Character> stack
                    = new Stack<>();
            HashMap<Character,Character> map= new HashMap<>();
            map.put(')','(');
            map.put(']','[');
            map.put('}','{');
            // Traversing the Expression
            for(char x: expr.toCharArray())
            {
                if (map.containsKey(x))
                {
                    if (stack.isEmpty())
                        return false;
                    if(stack.pop() != map.get(x))
                        return false;
                }
                else
                    stack.push(x);
            }

            // Check Empty Stack
            return (stack.isEmpty());
        }

        // Driver code
        public static void main(String[] args)
        {
            String expr = "([{}])";

            // Function call
            if (areBracketsBalanced(expr))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        }
    }