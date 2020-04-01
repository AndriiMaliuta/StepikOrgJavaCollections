package com.anma.lists;
/*
Given a sequence of strings separated by spaces.
Read the sequence from the standard input and store all strings to the list.
Output the list to the standard output using
System.out.println(yourList)
. The order of elements must be the same as in the input.
Sample Input:

Google Oracle JetBrains
Sample Output:

[Google, Oracle, JetBrains]
 */

import java.util.Arrays;
import java.util.Scanner;

public class List4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
    }
}
