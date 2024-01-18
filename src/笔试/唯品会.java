package 笔试;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/17 20:12:57
 */
public class 唯品会 implements Runnable {
    private int value = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (唯品会.class) {
                if(value <= 0){
                    break;
                }
                value--;
                System.out.println(value + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        唯品会 test = new 唯品会();
        Thread thread1 = new Thread(test,"thread1");
        Thread thread2 = new Thread(test,"thread2");
        thread1.start();
        thread2.start();
    }
}
