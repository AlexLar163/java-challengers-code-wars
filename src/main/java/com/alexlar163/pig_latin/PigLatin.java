/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 *
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
package com.alexlar163.pig_latin;

import java.util.Arrays;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }
    public static String pigIt(String str) {
        String[] strList = str.split(" ");
        for (int i = 0; i < strList.length; i++){
            char firstChar = strList[i].charAt(0);
            strList[i] = strList[i]
                    .substring(1)
                    .concat(firstChar + "ay");
        }
        return String.join(" ", strList);
    }
}

