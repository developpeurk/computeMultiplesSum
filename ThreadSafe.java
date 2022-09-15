package com.codingametest.yassine.demo;

class Counter{
    private static int count = 0;
    public static synchronized int increment(){
        count = count   + 1;
        return count;

    }
}

public class ThreadSafe {
    public static void main(String[] args)
      {

          System.out.println(Counter.increment());
          System.out.println(Counter.increment());
          System.out.println(Counter.increment());
          System.out.println(Counter.increment());
          System.out.println(Counter.increment());
          System.out.println(Counter.increment());
    }
}
