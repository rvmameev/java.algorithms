package lesson4.homework;

import java.util.EmptyStackException;

public class MyStack<T>
{
    private MyLinkedList<T> list;

    public MyStack()
    {
        list = new MyLinkedList<>();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public T pop() {
        return list.removeFirst();
    }

    public void push(T item) {
        list.insertFirst(item);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString()
    {
        return list.toString();
    }
}
