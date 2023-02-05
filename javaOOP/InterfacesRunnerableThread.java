package javaOOP;
// import java.*;

// import java.lang.*;

interface Runner {
    public void run();
}

public class InterfacesRunnerableThread {
    public static void main(String[] args) {
        System.out.println("thread current method" + Thread.currentThread().getName());
        System.out.println("creating runnable instance");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("From run method" + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        Thread th = new Thread(runnable);
        thread.start();
        System.out.println();
        th.start();
        Runner r = () -> {
            System.out.println("From run method class Runner " + Thread.currentThread().getName());

        };
        r.run();
    }
}
