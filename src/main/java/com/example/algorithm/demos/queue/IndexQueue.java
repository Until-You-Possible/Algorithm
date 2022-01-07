package com.example.algorithm.demos.queue;

import java.util.Random;

public class IndexQueue {


    public double testQueue(Queue<Integer> q, int opCount) {

        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0;  i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();
        return  ( startTime - endTime ) / 1000000000.0;

    }

    public static void main(String[] args) {

        int  opCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = new IndexQueue().testQueue(arrayQueue, opCount);
        System.out.println("array queue time1" + time1);

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = new IndexQueue().testQueue(loopQueue, opCount);
        System.out.println("array queue time2" + time2);
    }



    public void ArrayQueue() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        for (int j = 0; j <= 10; j++) {
            arrayQueue.enqueue(j);
            System.out.println(arrayQueue);
            if (j % 3 == 2) {
                arrayQueue.dequeue();
                System.out.println(arrayQueue);
            }
        }
    }

    public void LoopQueue() {
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        for (int i = 0; i <= 10; i++) {
            loopQueue.enqueue(i);
            System.out.println(loopQueue);
            if (i % 3 == 2) {
                loopQueue.dequeue();
                System.out.println(loopQueue);
            }
        }
    }
}
