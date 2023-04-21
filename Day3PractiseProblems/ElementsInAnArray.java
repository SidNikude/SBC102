// 1) Java Program to print the elements of an array
package Day3PractiseProblems;
import java.util.*;
public class ElementsInAnArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter a value for element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
