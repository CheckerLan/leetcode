package com.checker.code.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class code1117_2 {

    int hnum = 0;

    Lock lock = new ReentrantLock();

    Condition condition = lock.newCondition();

    public code1117_2() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        lock.lock();
        try {
            while (hnum >= 2){
                condition.await();
            }
            releaseHydrogen.run();
            hnum++;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        // 锁
        lock.lock();

        try {

            // 循环判断
            while(hnum < 2){
                // 礼让
                condition.await();
            }
            // 业务
            releaseOxygen.run();
            hnum = 0;
            // 通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 解锁
            lock.unlock();
        }

    }

}
