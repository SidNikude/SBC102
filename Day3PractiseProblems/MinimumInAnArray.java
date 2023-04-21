// 4) Java Program to print the smallest element in an array

package Day3PractiseProblems;

public class MinimumInAnArray
{
    public static void main(String[] args)
    {
        int arr [] = {11,2,3,4,5,6,7,8,9,1};
        int min = arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The minimum in array is " + min);
    }
}
