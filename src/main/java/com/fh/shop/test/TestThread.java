package com.fh.shop.test;



public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        TestCount testCount=new TestCount();
        for (int i = 0; i < 500; i++) {
            Thread thread=new Thread(testCount);
            thread.start();
        }
    Thread.sleep(1000);
        System.out.println(testCount.count);
    }
}
