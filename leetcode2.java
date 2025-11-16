package leetcode75;

import java.util.Scanner;

public class leetcode2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        System.out.println(gcdOfStrings(word1, word2));
        sc.close();
    }
//Solution1 -> Best
    // str1 = ABCABC
    // str2 = ABC
    public static String gcdOfStrings(String str1, String str2) {
       if (str1.length() > str2.length()) {
           return gcdOfStrings(str2, str1);
       }
       if (str1.equals(str2)) {
           return str1;
       }
       if (str1.startsWith(str2)){
           return gcdOfStrings(str1.substring(str2.length()), str2);
       }
        return "";
    }


//Solution2 -> worse but better than 3
//    public static String gcdOfStrings(String str1, String str2) {
//        if(!(str1 + str2).equals(str2 + str1))
//            return "";
//        int gdcLength = gdc(str1.length(), str2.length());
//        return str1.substring(0, gdcLength);
//    }
//
//    private static int gdc(int x, int y) {
//        if (y == 0)
//            return x;
//        else
//            return gdc(y, x % y);
//    }

// Solution3 -> worst
//    public static String gcdOfStrings(String str1, String str2) {
//        int word1Length = str1.length();
//        int word2Length = str2.length();
//        for (int i = Math.min(word1Length, word2Length); i > 0; i--) {
//            if (valid(str1, str2, i)){
//                return str1.substring(0, i);
//            }
//        }
//        return "nein";
//    }
//
//    public static boolean valid(String word1, String word2, int k) {
//        int len1 = word1.length();
//        int len2 = word2.length();
//        if (len1 % k>0 ||  len2 % k>0){
//            return false;
//        }else {
//            String base = word1.substring(0,k);
//            return word1.replace(base,"").isEmpty() &&
//                    word2.replace(base,"").isEmpty();
//        }
//    }
}
