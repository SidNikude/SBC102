// 1.3 Write a program to check two strings are equal or not.

package Day1PractiseProblem;
import java.util.Scanner;

public class StringEquality
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if(str1.equals(str2))
        {
            System.out.println("The strings are equal.");
        }
        else
        {
            System.out.println("The strings are not equal.");
        }
    }
}
