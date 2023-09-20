package Practiceset;

import java.util.Vector;

public class Assignment_no_12_ques5 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> buffer=new Vector<>(5);
		
		Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
	}

}
class Producer implements Runnable {
    private Vector<Integer> buffer;

    public Producer(Vector<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                produce(i);
                Thread.sleep(1000); // Simulate some work before producing the next item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void produce(int item) throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() == 5) {
                buffer.wait(); // Wait if the buffer is full
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            buffer.notify(); // Notify consumer that an item is added
        }
    }
}

class Consumer implements Runnable {
    private Vector<Integer> buffer;

    public Consumer(Vector<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                int item = consume();
                Thread.sleep(1500); // Simulate some work before consuming the next item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private int consume() throws InterruptedException {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                buffer.wait(); // Wait if the buffer is empty
            }
            int item = buffer.remove(0);
            System.out.println("Consumed: " + item);
            buffer.notify(); // Notify producer that an item is consumed
            return item;
        }
    }
}
