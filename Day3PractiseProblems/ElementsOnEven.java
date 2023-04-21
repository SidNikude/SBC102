// 5) Java Program to print the elements of an array present on an even position

package Day3PractiseProblems;

public class ElementsOnEven
{
    public static void main(String[] args)
    {
        int arr [] = {0,1,2,3,4,5,6,7,8,9,10};
        int max = arr[0];
        for(int i=1; i<arr.length;i+=2)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
