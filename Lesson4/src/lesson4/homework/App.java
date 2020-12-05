package lesson4.homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class App
{
    public static void main(String[] args)
    {
//      1. Реализовать remove() для итератора
        System.out.println("1. Реализовать remove() для итератора");

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        System.out.println(list);

        Iterator<Integer> iter = list.iterator();
        iter.next();
        iter.next();
        iter.next();
        iter.remove();
        System.out.println(list);
        iter = list.iterator();
        while (iter.hasNext())
        {
            iter.next();
            iter.remove();
        }
        System.out.println(list);

//      2. Добавить лист итератор в MyLinkedList
        System.out.println("2. Добавить лист итератор в MyLinkedList");

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);

        System.out.println(list);

        ListIterator<Integer> listIter = list.listIterator();
        System.out.println(listIter.next());
        System.out.println(listIter.next());
        System.out.println(listIter.previous());
        System.out.println(listIter.previous());

        listIter.next();
        listIter.next();
        listIter.next();
        listIter.remove();
        System.out.println(list);
        System.out.println(listIter.next());
        listIter.remove();
        System.out.println(list);
        listIter.set(5);
        System.out.println(list);
        listIter.add(6);
        System.out.println(list);
        listIter.previous();
        listIter.add(7);
        System.out.println(list);

//        3. Реалзовать класс стек используя MyLinkedList
        System.out.println("3. Реалзовать класс стек используя MyLinkedList");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
