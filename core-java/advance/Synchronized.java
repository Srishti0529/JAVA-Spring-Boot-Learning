class Counter {

    int count = 0;

    // synchronized method (only one thread at a time)
    synchronized void increment() {
        count++;
    }
}


// Thread class 1
class ThreadOne extends Thread {

    Counter c;

    ThreadOne(Counter c) {
        this.c = c;
    }

    public void run() {

        // loop 1000 times
        for(int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}


// Thread class 2
class ThreadTwo extends Thread {

    Counter c;

    ThreadTwo(Counter c) {
        this.c = c;
    }

    public void run() {

        // loop 1000 times
        for(int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class Synchronized {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        ThreadOne t1 = new ThreadOne(c);
        ThreadTwo t2 = new ThreadTwo(c);

        // start both threads
        t1.start();
        t2.start();

        // wait for threads to finish
        t1.join();
        t2.join();

        // final count
        System.out.println("Final Count : " + c.count);
    }
}
