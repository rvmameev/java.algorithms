package lesson6.homework;

import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        final int treesCount = 100000;
        final Random random = new Random();
        int balanceCount = 0;

        for (int i = 0; i < treesCount; i++)
        {
            MyTreeMap<Integer, Integer> tree = new MyTreeMap<>();

            int value = 0;

            while (tree.height() <= 6)
            {
                value = random.nextInt(201) - 100;

                tree.put(value, value);
            }

            tree.delete(value);

            if (tree.isBalance())
                balanceCount++;
        }

        System.out.printf("Сбалансированных деревьев %f%% (%d из %d)", (float)balanceCount/treesCount, balanceCount, treesCount);
    }
}
