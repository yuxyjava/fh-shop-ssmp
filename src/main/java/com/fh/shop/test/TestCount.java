package com.fh.shop.test;

public class TestCount implements Runnable{
    public int count=0;
    @Override
    public void run() {
        cycle();
    }
    private  void cycle(){
        count++;
    }
}
