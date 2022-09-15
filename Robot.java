package com.codingametest.yassine.demo;

class Player {
    public static String solve(int width, int height, int length, int mass) {

        int volume = width * height * length;
        int density = mass / volume;
        if ((volume >= 1000000 || width >= 150 || height >= 150 || length >= 150) && mass >= 20){
            return "REJECTED";

        }

        else if (volume >= 1000000 || width >= 150 || height >= 150 || length >= 150 || mass >= 20){
            return "SPECIAL";
        } else{
            return "STANDARD";}


    }
}

public class Robot {
    public static void main(String[] args) {
        System.out.println(Player.solve(1,1,9,0));
        System.out.println(Player.solve(1500,1,9,0));
        System.out.println(Player.solve(1500,1500,900,20));
    }
}
