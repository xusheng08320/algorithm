package com.xusheng.other;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class HashMapTest {

    @Test
    public void testHashMap() throws InterruptedException {
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 0);
        hashMap.put(16, 16);
        new Thread(() -> hashMap.put(0, 0)).start();
        new Thread(() -> hashMap.put(16, 16)).start();
        Thread.sleep(1000);
        System.out.println(hashMap.get(0));
        System.out.println(hashMap.get(16));
    }

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(false);
        lock.unlock();
    }

    @Test
    public void testThreadPoolExecutor() throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 20, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        Thread t = new Thread(() -> {
            try {
                TimeUnit.MINUTES.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executor.submit(t);
        executor.submit(t);
        executor.shutdown();
        executor.shutdownNow();
        TimeUnit.SECONDS.sleep(3);
        executor.setCorePoolSize(3);
        executor.submit(t);

        while (true) {
            System.out.println(executor.getActiveCount());
            System.out.println(executor.getCorePoolSize());
            System.out.println(executor.getQueue().size());
            TimeUnit.SECONDS.sleep(2);
        }

    }
}
