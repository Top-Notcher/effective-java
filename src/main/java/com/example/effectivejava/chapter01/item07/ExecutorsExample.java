package com.example.effectivejava.chapter01.item07;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfCpu = Runtime.getRuntime().availableProcessors();   // cpu 갯수
        ExecutorService service = Executors.newFixedThreadPool(numberOfCpu);
//        ExecutorService service1 = Executors.newCachedThreadPool();       // 필요한 만큼 쓰레드를 만든다. - 쓰레드가 무한정 늘어날 수 있다.
//        ExecutorService service1 = Executors.newSingleThreadExecutor();   // 쓰레드 하나가지고 모든 작업을 처리
//        ExecutorService service = Executors.newScheduledThreadPool(10);    // 입력이 순차적이라고 순차적 작업 X
//        for (int i = 0; i < 100; i++) {
//            Thread thread = new Thread(new Task());
//            thread.start();
            Future<String> submit = service.submit(new Task());
//        }

        System.out.println(Thread.currentThread() + " hello");

        System.out.println(submit.get());

        service.shutdown();
    }

//    private static class Task implements Runnable {
//        @Override
//        public void run() {
//            try {
//                Thread.sleep(2000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread() + " world");
//        }
//    }

    private static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }
}
