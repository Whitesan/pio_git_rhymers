package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {
    private IntArrayStack stack;
    public DefaultCountingOutRhymer(IntArrayStack stack)
    {
        this.stack = stack;
    }
    public DefaultCountingOutRhymer(){
        stack = new IntArrayStack();
    }

    public int getTotal()
    {
        return stack.getTotal();
    }
    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }



}
