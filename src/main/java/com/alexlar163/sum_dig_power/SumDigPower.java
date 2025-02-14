/***
 * The number
 * 89
 * 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number:
 * 89
 * =
 * 8
 * 1
 * +
 * 9
 * 2
 * 89=8
 * 1
 *  +9
 * 2
 *
 *
 * The next number in having this property is
 * 135
 * 135:
 *
 * See this property again:
 * 135
 * =
 * 1
 * 1
 * +
 * 3
 * 2
 * +
 * 5
 * 3
 * 135=1
 * 1
 *  +3
 * 2
 *  +5
 * 3
 *
 *
 * Task
 * We need a function to collect these numbers, that may receive two integers
 * a
 * a,
 * b
 * b that defines the range
 * [
 * a
 * ,
 * b
 * ]
 * [a,b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
 *
 * Examples
 * Let's see some cases (input -> output):
 *
 * 1, 10  --> [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * 1, 100 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
 */

package com.alexlar163.sum_dig_power;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class SumDigPower {
    public static void main(String[] args) {
        System.out.println(sumDigPow(1, 100));
    }
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> resultList = new ArrayList<>();
        for(Long i = a; i<=b; i++){
            String num = String.valueOf(i);
            AtomicInteger index = new AtomicInteger(1);

            long finalNum = num
                    .chars()
                    .mapToLong(value ->
                         (long) Math.pow(Character.getNumericValue(value), index.getAndIncrement())
                    )
                    .sum();
            System.out.println("finalNum: " + finalNum);
            System.out.println("num: " + num);
            if(finalNum == Long.parseLong(num)) {
                resultList.add(finalNum);
            }


        }
        return resultList;
    }
}