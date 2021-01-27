package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
    public IntArrayStack stack;
    public defaultCountingOutRhymer(IntArrayStack stack)
    {
        this.stack = stack;
    }
    public defaultCountingOutRhymer(){
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

    protected int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }



}
