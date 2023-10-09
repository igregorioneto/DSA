package org.gn.stack.challenge;

public class Hanoi {
    private int stack[];
    private int stack2[];
    private int stack3[];
    private int top;
    private int size;

    public Hanoi(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[this.size / 2];
        this.stack2 = new int[this.size / 2];
        this.stack3 = new int[this.size];
    }
}
