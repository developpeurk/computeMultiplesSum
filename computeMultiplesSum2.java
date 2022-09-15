package com.codingametest.yassine.demo;

class Solution{
    public static int computeMultiplesSum(int n){


        int sum = 0;
        for(int i=1; i<n; i++)
        {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum += i;

        }


        return sum;
    }
}

public class computeMultiplesSum2 {


    public static void main(String[] args) {
        System.out.println(Solution.computeMultiplesSum(15));
        System.out.println(Solution.computeMultiplesSum(100));
        //40

    }


}
