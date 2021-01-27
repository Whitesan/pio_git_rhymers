package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.IntStack;

public class IntArrayStack implements IntStack {
    public final int INITIAL = -1;
    public final int MAX_SIZE = 12;
    public final int DEFAULT_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = INITIAL;
    public int getTotal()
    {
        return total;
    }
    public int[] getNumbers()
    {
        return numbers;
    }
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    public int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }


}
