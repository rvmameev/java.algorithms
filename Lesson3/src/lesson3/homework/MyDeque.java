package lesson3.homework;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private static final int DEFAULT_CAPACITY = 32;
    private int left;
    private int right;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        this(DEFAULT_CAPACITY);
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return list[left];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return list[prevIndex(right)];
    }

    public T removeLeft() {
        T tmp = peekLeft();
        size--;
        list[left] = null;
        left = nextIndex(left);
        return tmp;
    }

    public T removeRight()
    {
        T tmp = peekRight();
        size--;
        list[prevIndex(right)] = null;
        right = prevIndex(right);
        return tmp;
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        size++;
        left = prevIndex(left);
        list[left] = item;
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        size++;
        list[right] = item;
        right = nextIndex(right);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        if (size == 0)
            return "[]";

        StringBuilder sb = new StringBuilder("[");

        int i = left;

        while (true)
        {
            sb.append(list[i] + ", ");
            i = nextIndex(i);
            if (i == right)
                break;
        }

        sb.setLength(sb.length() - 2);
        sb.append("]");

        return sb.toString();
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index)
    {
        if (index == 0)
            return list.length - 1;

        return index - 1;
    }
}
