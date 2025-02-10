/***
 * Make a program that filters a list of strings and returns a list with only your friends name in it.
 *
 * If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...
 *
 * Input = ["Ryan", "Kieran", "Jason", "Yous"]
 * Output = ["Ryan", "Yous"]
 *
 * Input = ["Peter", "Stephen", "Joe"]
 * Output = []
 * Input strings will only contain letters.
 * Note: keep the original order of the names in the output.
 */

package com.alexlar163.friend_or_foe;

import java.util.List;
import java.util.stream.Collectors;

class Kata {
    public static void main (String[] args) {
        List<String> friendList = List.of("Ryan", "Kieran", "Jason", "Yous");
        System.out.println(friend(friendList));
    }

    public static List<String> friend(List<String> x){
        return x.stream().filter(item -> item.length() == 4).toList();
    }
}
