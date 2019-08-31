package com.example.javabasedemo.day02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-08-31 14:55
 */
public class MyCallable implements Callable {
    @Override
    public Integer call(){
        return 123;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}