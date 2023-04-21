// 2) Java Program to find the frequency of each element in the array
package Day3PractiseProblems;
import java.util.*;
class FrequencyArray
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 2, 1, 3, 4, 5, 4, 6, 7, 8, 7, 6, 5};
        int[] freq = new int[array.length];

        for (int i = 0; i < array.length; i++)
        {
            if (freq[i] == 0)
            {
                int count = 1;
                for (int j = i+1; j < array.length; j++)
                {
                    if (array[i] == array[j])
                    {
                        count++;
                        freq[j] = 1;
                    }
                }
                        freq[i] = count;
            }
        }

        for (int i = 0; i < freq.length; i++)
        {
                    if (freq[i] != 0)
                    {
                        System.out.println(array[i] + " occurs " + freq[i] + " times");
                    }
        }
    }
}