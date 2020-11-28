package lesson1.homework;

class Solution
{
    public static String[] dup(String[] arr)
    {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            result[i] = dup(arr[i]);
        }

        return result;
    }

    private static String dup(String str)
    {
        char[] chars = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        int start = 0;

        while (start < chars.length)
        {
            int end = start + 1;

            while (end < chars.length && chars[start] == chars[end]) end++;

            sb.append(chars[start]);

            start = end;
        }

        return sb.toString();
    }
}