/***
 * Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
 *
 * For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
 *
 * The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).
 *
 * Based on: https://leetcode.com/problems/two-sum/
 *
 * two_sum([1, 2, 3], 4) == {0, 2}
 * two_sum([3, 2, 4], 6) == {1, 2}
 */

package com.alexlar163.two_sum;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i]+numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
