package lesson1.homework;

import java.util.Arrays;

public class App
{
//    https://www.codewars.com/kata/59f08f89a5e129c543000069/train/java
//
//    In this Kata, you will be given an array of strings and your task is to remove all consecutive
//    duplicate letters from each string in the array.
//    For example:
//        dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
//        dup(["kelless","keenness"]) = ["keles","kenes"].
//    Strings will be lowercase only, no spaces. See test cases for more examples.

    public static void main(String[] args)
    {
        String[] strs = new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"};

        System.out.println(Arrays.toString(strs));

        String[] dup = Solution.dup(strs);

        System.out.println(Arrays.toString(dup));
    }
}
