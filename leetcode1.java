package leetcode75;

import java.util.Scanner;

public class leetcode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        System.out.println(mergeAlternately(word1, word2));
        sc.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(word1.length() + word2.length());
        int str1Length = word1.length();
        int str2Length = word2.length();
        int i = 0;
        int k = 0;

        while(i < str1Length || k < str2Length){
            if (i < str1Length){
                result.append(word1.charAt(i++));
            }
            if (k < str2Length){
                result.append(word2.charAt(k++));
            }
        }
        return result.toString();
    }
}
