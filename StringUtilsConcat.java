package com.codingametest.yassine.demo;


import java.util.Arrays;
import java.util.stream.Collectors;

class StringUtils {
    static String str = "";
    static String concat(String[]strings){

              return  Arrays.stream(strings).collect(Collectors.joining()).concat(str);
    }

    public static void main(String[] args) {

        System.out.println(StringUtils.concat(new String[]{"f","o","o","bar"})); //foobar
        System.out.println(StringUtils.concat(new String[]{"t","o","o","bar"})); //foobar
    }
}
