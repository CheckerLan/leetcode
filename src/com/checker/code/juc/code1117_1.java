package com.checker.code.juc;


public class code1117_1 {

    int hnum = 0;

    public code1117_1() {

    }

    // 加锁
    public synchronized void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        // 判断
        while (hnum == 2) {
            // 礼让
            this.wait();

        }
        // 业务
        releaseHydrogen.run();
        hnum++;

        // 通知
        this.notifyAll();

    }// 解锁

    public synchronized void oxygen(Runnable releaseOxygen) throws InterruptedException {
        while (hnum < 2) {
            this.wait();
        }
        releaseOxygen.run();
        hnum = 0;
        this.notifyAll();

    }
}