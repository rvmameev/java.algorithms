package lesson5.homework;

import java.util.*;

public class BackpackResolver
{
    private final ArrayList<Item> items;
    private final int maxWeight;

    private ArrayList<Item> optimalList = null;
    private int optimalPrice = 0;

    public BackpackResolver(ArrayList<Item> items, int maxWeight)
    {
        if (items == null)
            throw new IllegalArgumentException("items: " + items);

        this.items = items;
        this.maxWeight = maxWeight;
    }

    public void Resolve()
    {
        checkItems(items);
    }

    public List<Item> getOptimalList()
    {
        return optimalList;
    }

    public int getOptimalPrice()
    {
        return optimalPrice;
    }

    private int itemsWeight(ArrayList<Item> items)
    {
        int sum = 0;

        for (int i = 0; i < items.size(); i++)
        {
            sum += items.get(i).getWeight();
        }

        return sum;
    }

    private int itemsPrice(ArrayList<Item> items)
    {
        int sum = 0;

        for (int i = 0; i < items.size(); i++)
        {
            sum += items.get(i).getPrice();
        }

        return sum;
    }

    private void checkOptimalItems(ArrayList<Item> items)
    {
        int itemsWeight = itemsWeight(items);
        int itemsPrice = itemsPrice(items);

        if (itemsWeight <= maxWeight && itemsPrice > optimalPrice)
        {
            optimalPrice = itemsPrice;
            optimalList = items;
        }
    }

    private void checkItems(ArrayList<Item> items)
    {
        if (items.size() > 0)
            checkOptimalItems(items);

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Item> newList = new ArrayList<>(items);

            newList.remove(i);

            checkItems(newList);
        }

    }
}
