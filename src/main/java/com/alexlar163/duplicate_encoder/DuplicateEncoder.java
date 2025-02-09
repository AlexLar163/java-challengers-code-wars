// The goal of this exercise is to convert a string to a
// new string where each character in the new string is "(" if that character appears
// only once in the original string, or ")" if that character appears more than once in the original string.
// Ignore capitalization when determining if a character is a duplicate.
//
// Examples
// "din"      =>  "((("
// "recede"   =>  "()()()"
// "Success"  =>  ")())())"
// "(( @"     =>  "))(("

package com.alexlar163.duplicate_encoder;


public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(DuplicateEncoder.encode("Prespecialized"));
    }
    static String encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i=0; i<word.length(); i++) {
            boolean isMore = word.indexOf(word.charAt(i)) != word.lastIndexOf(word.charAt(i));
            result = result.concat(isMore ? ")" : "(");
        }
        return result;
    }
}

