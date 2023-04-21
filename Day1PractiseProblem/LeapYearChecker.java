// 1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
package Day1PractiseProblem;
import java.util.*;
public class LeapYearChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0) || (year%100==0 && year%400==0))
        {
            System.out.println(year + " is a leap year ");
        }

        else
        {
            System.out.println(year + " is not a leap year ");
        }

    }


}
