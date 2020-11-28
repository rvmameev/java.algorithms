package lesson2.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        int listSize = 50000; // 1000000 слишком много, очень долгие сортировки
        Random random = new Random();
        MyArrayList<Integer> list = new MyArrayList<>();

        for (int i = 0; i < listSize; i++)
        {
            list.add(random.nextInt(i + 100));
        }

        final MyArrayList<Integer> list1 = list.copy();
        final MyArrayList<Integer> list2 = list.copy();
        final MyArrayList<Integer> list3 = list.copy();

        System.out.printf("Lists created. Size = %d. Capacity = %d%n", list.size(), list.capacity());

        printList(list);

        System.out.printf("selectionSort: %dms%n" , passedMilliseconds(() -> list1.selectionSort()));
        System.out.printf("insertionSort: %dms%n" , passedMilliseconds(() -> list2.insertionSort()));
        System.out.printf("bubbleSort: %dms%n" , passedMilliseconds(() -> list3.bubbleSort()));

        System.out.printf("selectionSort on sorted array: %dms%n" , passedMilliseconds(() -> list1.selectionSort()));
        System.out.printf("insertionSort on sorted array: %dms%n" , passedMilliseconds(() -> list2.insertionSort()));
        System.out.printf("bubbleSort on sorted array: %dms%n" , passedMilliseconds(() -> list3.bubbleSort()));

        final MyArrayList<Integer> list4 = list.copy();
        final MyArrayList<Integer> list5 = list.copy();
        final MyArrayList<Integer> list6 = list.copy();

        System.out.printf("selectionSort with Comparator.reverseOrder: %dms%n" , passedMilliseconds(() -> list4.selectionSort(Comparator.reverseOrder())));
        System.out.printf("insertionSort with Comparator.reverseOrder: %dms%n" , passedMilliseconds(() -> list5.insertionSort(Comparator.reverseOrder())));
        System.out.printf("bubbleSort with Comparator.reverseOrder: %dms%n" , passedMilliseconds(() -> list6.bubbleSort(Comparator.reverseOrder())));

        printList(list1);
        printList(list2);
        printList(list3);
        printList(list4);
        printList(list5);
        printList(list6);
    }

    private static long passedMilliseconds(Runnable runnable)
    {
        long begin = System.currentTimeMillis();

        runnable.run();

        long end = System.currentTimeMillis();

        return end - begin;
    }

    private static void printList(MyArrayList<Integer> list)
    {
        if (list.size() > 20)
        {
//            System.out.printf("Too much list size (%d)%n", list.size());
        }
        else
        {
            System.out.println(list);
        }
    }
}
