package lesson3.homework;

public class App
{
    public static void main(String[] args)
    {
        // 1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
        demoReverseString("1234abcd");

        // 2. Создать класс для реализации дека.
        demoDeque();
    }

    private static void demoDeque()
    {
        MyDeque<Integer> deq = new MyDeque<>(5);

        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        deq.insertRight(4);
        deq.insertRight(5);
        System.out.println("deq:\n" + deq);

        System.out.println("removeRight: " + deq.removeRight());
        System.out.println(deq);

        deq.insertLeft(6);
        System.out.println("insertLeft 6:\n" + deq);

        System.out.println("removeRight: " + deq.removeRight());
        System.out.println(deq);

        System.out.println("removeLeft: " + deq.removeLeft());
        System.out.println(deq);

        System.out.println("removeLeft: " + deq.removeLeft());
        System.out.println(deq);

        System.out.println("removeRight: " + deq.removeRight());
        System.out.println(deq);

        System.out.println("removeLeft: " + deq.removeLeft());
        System.out.println(deq);
    }

    private static void demoReverseString(String str)
    {
        // stack - частный случай deque, используем deque как stack

        System.out.println("input string:\n" + str);

        char[] chars = str.toCharArray();

        MyDeque<Character> charStack = new MyDeque<>(chars.length);

        for (char ch : chars)
            charStack.insertLeft(ch);

        StringBuilder sb = new StringBuilder();

        while (!charStack.isEmpty())
            sb.append(charStack.removeLeft());

        System.out.println("reverse string:\n" + sb.toString());
    }
}
