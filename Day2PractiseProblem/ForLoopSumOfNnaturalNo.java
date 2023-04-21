// Programs With For Loop
//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

package Day2PractiseProblem;

public class ForLoopSumOfNnaturalNo
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=0; i<=5; i++)
        {
            sum+=i;
        }
        System.out.println("The sum of n natural numbers is " + sum);
    }
}
