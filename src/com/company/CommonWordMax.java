package com.company;
import java.util.*;
class CommonWordMax {
    public static String mostCommonWord(String paragraph, String[] banned) {

        // 1). replace the punctuations with spaces,
        // and put all letters in lower case
        String normalizedStr = paragraph.replaceAll(",", " ").toLowerCase();

        // 2). split the string into words
        String[] words = normalizedStr.split(" ");
        List bannedWords = Arrays.asList(banned);

        Map<String, Integer> wordCount = new HashMap();
        // 3). count the appearance of each word, excluding the banned words
        for (String word : words) {
            if (!bannedWords.contains(word))
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        // 4). return the word with the highest frequency
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    public static void main(String[] args)
    {
        String expr = "test ,test me a a";
        String[] banned = {"a","b"};
        System.out.println(mostCommonWord(expr, banned));
    }

}