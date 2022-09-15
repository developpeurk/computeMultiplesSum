package com.codingametest.yassine.demo;

import java.util.regex.Pattern;

public class StringSplit {
    public static void main(String[] args) {
        String str= "This is a String\nThis is the next line.\nHello World";
        String [] r = str.split("\n");
        for (int i = 0; i < r.length ; i++) {
            System.out.println(r[i]);
        }


    }
}
