/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 *
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
package com.alexlar163.pig_latin;

public class PigLatin {
    public static void main(String[] args) {
//        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("tora o mores !"));
    }
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}

