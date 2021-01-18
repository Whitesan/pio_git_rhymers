package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public final int INITIAL = -1;
    public final int MAX_SIZE = 12;
    public final int DEFAULT_VALUE = -1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int total = INITIAL;
    public int getTotal()
    {
        return total;
    }
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total--];
    }

}
