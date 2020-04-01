package com.anma.lists;

import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {

        List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));

        Object[] objArray = new Object[letterList.size()];
        objArray = letterList.toArray(objArray);

        for (int i = 0; i < objArray.length; i++) {
            System.out.println(objArray[i]);
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}

