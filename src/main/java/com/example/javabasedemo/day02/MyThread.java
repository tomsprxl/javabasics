package com.example.javabasedemo.day02;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-08-31 14:58
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run .....");
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}