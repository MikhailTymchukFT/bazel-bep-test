package com.company;

import org.junit.Test;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Test6 {
    @Test
    public void test() {
        try {
            System.out.println("[" + Thread.currentThread().getId() + "] Test started: " + Instant.now() );
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[" + Thread.currentThread().getId() + "] Test finished: " + Instant.now() );
    }
}
