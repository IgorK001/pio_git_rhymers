package edu.kis.vh.nursery.list;

/**
 * class with methods using stack approach
 */
public class IntLinkedList {
    public static final int RETURN_VALUE = -1;

    Node last;
    int i;

    /**
     *
     * @param i
     * push number i and put it on top of the stack
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * @return
     * return boolean value 1 - if stack is empty 0 if not
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return
     * return boolen 0-not full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return
     * return value of element in top of the stack
     */
    public int top() {
        if (isEmpty())
            return RETURN_VALUE;
        return last.value;
    }

    /**
     * @return
     * pop top value from stack if its empty return RETURN_VALUE(-1)
     */
    public int pop() {
        if (isEmpty())
            return RETURN_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
