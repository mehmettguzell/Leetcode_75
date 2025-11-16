package Leetcode_75;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kaç çocuk var?");
        int n = sc.nextInt();
        int[] candies = new int[n];

        System.out.println("Her çocuğun şeker sayısını gir (boşlukla ayır):");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.println("Extra candies sayısını gir:");
        int extraCandies = sc.nextInt();

        List<Boolean> result = new leetcode3().kidsWithCandies(candies, extraCandies);
        System.out.println(result);

        sc.close();
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;

        for (int c: candies) {
            if (c > max) {
                max = c;
            }
        }

        List<Boolean> result = new ArrayList<>(n);

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
