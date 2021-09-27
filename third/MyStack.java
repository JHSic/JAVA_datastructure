package test;

public class MyStack<E> {
    private E[] data;
    private int top;
    private int size;

    public MyStack() {
        this.size = 5;
        this.top = 0;
        data = (E[]) (new Object[size]);
    }

    public void push(E data) {
        if (size == top + 1)
            resize();

        this.data[top++] = data;
    }

    public E pop() {
        if (top == 0)
            return null;
        return data[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    private void resize() {
        E[] newData = (E[]) new Object[size * 2];
        for (int i = 0; i < top; i++) {
            newData[i] = data[i];
        }
        size *= 2;

        data = newData;
    }

}
