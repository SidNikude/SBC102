// 6) Java Program to print the elements of an array in reverse order
package Day3PractiseProblems;

public class PrintArrayInReverseOrder
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i=arr.length;
        for(i=arr.length-1; i>=0 ; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
