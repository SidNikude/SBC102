// 2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package Day2PractiseProblem;
import java.util.Scanner;

public class ForLoopReverseANumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = sc.nextInt();
        int ans=0;
        System.out.print("Reverse of the integer number is ");
        for(;n>0;n/=10)
        {
            ans = n%10;
            System.out.print(ans);

        }

    }
}
