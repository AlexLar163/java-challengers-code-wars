package com.alexlar163.break_camel_case;

import java.util.stream.Collectors;

public class Solution {
    public static void main (String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}