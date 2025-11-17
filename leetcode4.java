package Leetcode_75;

import java.util.Scanner;

public class leetcode4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Flowerbed length: ");
        int length = sc.nextInt();

        int[] flowerbed = new int[length];

        System.out.println("Enter flowerbed values (0 or 1):");
        for (int i = 0; i < length; i++) {
            flowerbed[i] = sc.nextInt();
            if (flowerbed[i] != 0 && flowerbed[i] != 1) {
                System.out.println("Invalid input! Only 0 or 1 allowed.");
                return;
            }
        }

        System.out.print("How many new flowers (n): ");
        int n = sc.nextInt();

        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println("Result: " + result);
    }
    // Second Solution
    public static boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        int planted = 0;
        for(int i=0;i<flowerbed.length;i+=2)
        {
            if(flowerbed[i]==0)
            {
                if(i==flowerbed.length-1 || flowerbed[i+1]==0)
                {
                    planted++;
                    flowerbed[i] = 1;
                }
                else
                {
                    i++;
                }
            }
        }
        return n<=planted;
    }

    //First Solution
//    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int planted = 0;
//
//        for (int i = flowerbed.length - 1; i >= 0 ; i--) {
//            if (flowerbed[i] == 1) {
//                continue;
//            }
//
//            boolean left = (i == 0) || (flowerbed[i - 1] == 0);
//            boolean right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
//
//            if (left && right) {
//                planted++;
//                flowerbed[i] = 1;
//            }
//        }
//        return planted >= n;
//    }
}
