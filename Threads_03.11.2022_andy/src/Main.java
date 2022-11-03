

public class Main {

    /* Реализовать 2 потока. Один должен печатать слово ping 20 раз, второй должен
       печатать слово pong.
       Запустить и синхронизировать потоки таким способом, чтобы программа выводила
       ping pong ping pong */

    public static void main(String[] args) throws InterruptedException {

        final Object lock = new Object();
        Thread threadOne = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                synchronized (lock) {
                    System.out.println("Ping");

                    try {
                        //Unterbrechung einen Thread
                        lock.wait();
                        // no more sleep, wacht auf.
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                synchronized (lock) {
                    lock.notify();

                    System.out.println("Pong");
                    try {

                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
    }

}

