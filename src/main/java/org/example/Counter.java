package org.example;

public class Counter implements AutoCloseable {
    private int count;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        if (count > 0) {
            System.out.println("Counter closed successfully with count: " + count);
        } else {
            throw new Exception("Counter was not used or not properly closed.");
        }
    }
}



