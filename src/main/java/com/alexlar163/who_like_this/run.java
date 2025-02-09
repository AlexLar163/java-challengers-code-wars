// You probably know the "like" system from Facebook and other pages.
// People can "like" blog posts, pictures or other items.
// We want to create the text that should be displayed next to such an item.
//
//Implement the function which takes an array containing the names of
// people that like an item. It must return the display text as shown in the examples:

//        []                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

package com.alexlar163.who_like_this;

public class run {
    public static void main(String[] args) {
        System.out.println(run.whoLikesIt());
        System.out.println(run.whoLikesIt("Peter"));
        System.out.println(run.whoLikesIt("Jacob", "Alex"));
        System.out.println(run.whoLikesIt("Max", "John", "Mark"));
        System.out.println(run.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }


    public static String whoLikesIt(String... names) {
        int namesSize = names.length;
        return switch(namesSize) {
            case 0: yield("no one likes this");
            case 1: yield(String.format("%s likes this", names[0]));
            case 2: yield(String.format("%s and %s like this", names[0], names[1]));
            case 3: yield(String.format("%s, %s and %s like this", names[0], names[1], names[2]));
            default: yield(String.format("%s, %s and %d others like this", names[0], names[1], namesSize-2));
        };
    }
}
