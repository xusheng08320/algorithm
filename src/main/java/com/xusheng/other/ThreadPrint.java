package com.xusheng.other;

import org.junit.Test;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPrint {

    Semaphore semaphoreA = new Semaphore(1);
    Semaphore semaphoreB = new Semaphore(0);
    Semaphore semaphoreC = new Semaphore(0);

    @Test
    public void testPrint() throws InterruptedException {
        Thread threadA = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    semaphoreA.acquire();
                    System.out.println("A");
                    semaphoreB.release();
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    semaphoreB.acquire();
                    System.out.println("B");
                    semaphoreC.release();
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    semaphoreC.acquire();
                    System.out.println("C");
                    semaphoreA.release();
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();

        Thread.sleep(5000);
    }
}
