package com.anma.sets;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();

        int size = scanner.nextInt();
        int counter = 0;
        while (counter < size) {
            Scanner scanner2 = new Scanner(System.in);
            String str = scanner2.nextLine();
            set.add(str);
            counter++;
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
