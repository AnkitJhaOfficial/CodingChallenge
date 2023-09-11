/*
Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
        Take the set of integers
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
        First, delete every second number, we get following reduced set.
        1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
        Now, delete every third number, we get
        1, 3, 7, 9, 13, 15, 19,….….
        Continue this process indefinitely……
        Any number that does NOT get deleted due to above process is called “lucky”.

        You are given a number N, you need to tell whether the number is lucky or not. If the number is lucky return 1 otherwise 0.

        Example 1:

        Input:
        N = 5
        Output: 0
        Explanation: 5 is not a lucky number
        as it gets deleted in the second
        iteration.
        Example 2:

        Input:
        N = 19
        Output: 1
        Explanation: 19 is a lucky number because
        it does not get deleted throughout the process.
        */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LuckyNumber {
    public static void main(String[] args) {
        int n = 91;
        int luckyNumber = isLuckyNumber(n);
        if (luckyNumber == 0) {
            System.out.println(n + " is not a lucky number");
        } else {
            System.out.println(n + " is a lucky number");
        }
    }

    public static int isLuckyNumber(int number) {
        if (number % 2 == 0) {
            return 0;
        }
        int index = 2;
        List<Integer> integerList = IntStream.range(1, number + 1).boxed().collect(Collectors.toList());
        while (integerList.size() >= index) {
            int i = index - 1;
            while (integerList.size() > i) {
                integerList.remove(i);
                i = i + index - 1;
            }
            index++;
        }
        if (integerList.contains(number)) {
            return 1;
        } else {
            return 0;
        }
    }
}
