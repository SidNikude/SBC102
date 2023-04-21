// Operator Programs
//1. Enter two numbers and do the following arithmetic Operations find max and min.
// i) a+b*c ii) c+a/b
// iii) a%b+c iV) a*b+c

package Day2PractiseProblem;
import java.util.*;
import java.util.Scanner;
public class FindMaxMin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c ");
        int c = sc.nextInt();
        int ans1 = a+b*c;
        System.out.println("ans1" + "=" + ans1);
        int ans2 = c+a/b;
        System.out.println("ans2" + "=" + ans2);
        int ans3 = a%b+c;
        System.out.println("ans3" + "=" + ans3);
        int ans4 = a*b+c;
        System.out.println("ans4" + "=" + ans4);
        int max1 = Math.max(ans1,ans2);
        int max2 = Math.max(max1,ans3);
        int max3 = Math.max(max2,ans4);
        System.out.println("The maximum is " + max3);


    }
}
