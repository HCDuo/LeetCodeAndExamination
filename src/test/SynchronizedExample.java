package test;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/23 23:05
 */
public class SynchronizedExample {

    static int count = 0;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i=1; i<=1000; i++) {
                // 值得注意的是此处的锁不应该放在for循环外层，那样会导致两个线程变为串行执行
                // 因为其中一个线程进入for循环之后就被阻塞了
                synchronized (lock) {
                    System.out.println(111);
                    count++;
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            for (int i=1; i<=1000; i++) {
                synchronized (lock) {
                    System.out.println(222);
                    count--;
                }
            }
        }, "t2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count); // 因为对自增和自减操作上了锁，所以避免了竞态条件，结果为0

        Executors.newCachedThreadPool();

    }
}
