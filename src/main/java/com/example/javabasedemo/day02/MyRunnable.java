package com.example.javabasedemo.day02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-08-31 14:52
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("run........");
    }


    public static void main(String[] args) {
//        MyRunnable instance = new MyRunnable();
//        Thread thread = new Thread(instance);
//        thread.start();

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
    }
}