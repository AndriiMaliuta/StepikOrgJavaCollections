package com.beastiehut.queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Queue1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            list.add(input);
        }

        Collections.sort(list);
        Collections.reverse(list);

        for (int i : list) {
            System.out.println(i);
        }
        scanner.close();
    }
}