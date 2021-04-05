package com.checker.code.juc;

import java.util.concurrent.CountDownLatch;

// 可以确保顺序
public class code1117_3 {
    private CountDownLatch countDownLatch = new CountDownLatch(2);

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        releaseHydrogen.run();
        countDownLatch.countDown();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        countDownLatch.await();
        releaseOxygen.run();

    }
}
