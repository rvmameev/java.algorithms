package lesson5.homework;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
//        1. Написать программу по возведению числа в степень с помощью рекурсии.
        System.out.println("1. Написать программу по возведению числа в степень с помощью рекурсии");
        System.out.println("2^10=" + pow(2, 10));

//        2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
        System.out.println("2. Написать программу «Задача о рюкзаке» с помощью рекурсии.");

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, 600));
        items.add(new Item(3, 5000));
        items.add(new Item(5, 1500));
        items.add(new Item(2, 20000));
        items.add(new Item(1, 500));

        int maxWeight = 11;

        System.out.println("Исходный набор:");
        System.out.println(items);

        BackpackResolver resolver = new BackpackResolver(items, maxWeight);
        resolver.Resolve();

        System.out.println("Оптимальный набор для ораничения по весу " + maxWeight + ":");
        System.out.println(resolver.getOptimalList());
    }

    private static long pow(int num, int pow)
    {
        if (pow == 1)
            return num;

        return num * pow(num, pow - 1);
    }
}
